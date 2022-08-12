package com.act.model;

import static com.util.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActJDBCDAO implements I_ActDAO{
	
	private static final String INSERT = "insert into act( "
			+ "mem_no, act_type_no, act_title, "
			+ "act_content, "
			+ "act_current_count, act_min_count, act_max_count,  "
			+ "act_enroll_begin, act_enroll_end, act_start, act_end, "
			+ "act_loc, act_pl, "
			+ "act_rate_sum, act_eval_sum) "
			+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String UPDATE = "update act set mem_no = ?, act_type_no = ?, act_title = ? "
			+ ", act_content = ?, act_current_count = ?, act_min_count = ? "
			+ ", act_max_count = ?, act_enroll_begin = ?, act_enroll_end= ? "
			+ ", act_start = ?, act_end = ?, act_loc = ?, act_pl = ?, act_rate_sum = ? "
			+ ", act_eval_sum = ? where act_no = ?";
	
	private static final String UPDATE_ACT_STATUS = "update act set act_status = ? where act_no = ?;";
	
	private static final String GET_ALL = "select act_no "
			+ ", mem_no, act_type_no, act_title, act_content "
			+ ", act_current_count, act_min_count, act_max_count "
			+ ", act_enroll_begin, act_enroll_end, act_start "
			+ ", act_end, act_loc, act_pl, act_rate_sum "
			+ ", act_eval_sum, act_status  "
			+ "from act";
	
	private static final String GET_HOST_ACT = "select act_no, act_type_no, act_title "
			+ ", act_content, act_current_count, act_min_count "
			+ ", act_max_count, act_enroll_begin, act_enroll_end "
			+ ", act_start, act_end, act_loc, act_pl, act_rate_sum"
			+ ", act_eval_sum where mem_no = ?";
	
	private static final String FIND_ACT_BY_TYPE = "select act_no, mem_no, act_title "
			+ ", act_content, act_current_count, act_min_count "
			+ ", act_max_count, act_enroll_begin, act_enroll_end "
			+ ", act_start, act_end, act_loc, act_pl, act_rate_sum"
			+ ", act_eval_sum where act_type_no = ?";
	
	private static final String FIND_AEB = "select act_no, mem_no, act_type_no, act_title "
			+ ", act_content, act_min_count "
			+ ", act_max_count, act_enroll_begin, act_enroll_end "
			+ ", act_start, act_end, act_loc, act_pl, act_rate_sum"
			+ ", act_eval_sum from act where act_current_count = ?";
	
	private static final String FIND_AEE = "select act_no, mem_no, act_type_no, act_title "
			+ ", act_content, act_current_count, act_min_count "
			+ ", act_max_count, act_enroll_begin "
			+ ", act_start, act_end, act_loc, act_pl, act_rate_sum"
			+ ", act_eval_sum from act where act_enroll_end = ?";
	
	private static final String FIND_AEBE = "select act_no, mem_no, act_type_no, act_title "
			+ ", act_content, act_current_count, act_min_count "
			+ ", act_max_count  "
			+ ", act_start, act_end, act_loc, act_pl, act_rate_sum"
			+ ", act_eval_sum from act where act_enroll_begin = ? and act_enroll_end = ? ";
	
	private static final String FIND_ASBE = "select act_no, mem_no,act_type_no, act_title "
			+ ", act_content, act_current_count, act_min_count "
			+ ", act_max_count, act_enroll_begin, act_enroll_end "
			+ ", act_loc, act_pl, act_rate_sum"
			+ ", act_eval_sum from act where act_start = ? and act_end =?";
	
	private static final String GET_ACT_EVAL_AVG = "select act_no "
			+ ", mem_no, act_type_no, act_title, act_content "
			+ ", act_current_count, act_min_count, act_max_count "
			+ ", act_enroll_begin, act_enroll_end, act_start "
			+ ", act_end, act_loc, act_pl, act_status  "
			+ "from act where (act_rate_sum / act_eval_sum) > ?";

	private static final String GET_ASET = "select act_no "
			+ ", mem_no, act_type_no, act_title, act_content "
			+ ", act_current_count, act_min_count, act_max_count "
			+ ", act_enroll_begin, act_enroll_end, act_start "
			+ ", act_end, act_loc, act_pl, (act_rate_sum / act_eval_sum) as avgStar, act_status "
			+ "from act where act_type_no = ?";

	private static final String GET_ACT_LOC = "select act_no "
			+ ", mem_no, act_type_no, act_title, act_content "
			+ ", act_current_count, act_min_count, act_max_count "
			+ ", act_enroll_begin, act_enroll_end, act_start "
			+ ", act_end, act_loc, act_pl, (act_rate_sum / act_eval_sum) as avgStar, act_status "
			+ "from act where act_loc = ?";
	
	private static final String FIND_ACT_BY_MIN_COUNT = "select act_no "
			+ ", mem_no, act_type_no, act_title, act_content "
			+ ", act_current_count, act_min_count, act_max_count "
			+ ", act_enroll_begin, act_enroll_end, act_start "
			+ ", act_end, act_loc, act_pl, (act_rate_sum / act_eval_sum) as avgStar, act_status "
			+ "from act where act_max_count >= ?";
	
	private static final String FIND_ACT_BY_MAX_COUNT = "select act_no "
			+ ", mem_no, act_type_no, act_title, act_content "
			+ ", act_current_count, act_min_count, act_max_count "
			+ ", act_enroll_begin, act_enroll_end, act_start "
			+ ", act_end, act_loc, act_pl, (act_rate_sum / act_eval_sum) as avgStar, act_status "
			+ "from act where act_max_count <= ?";

	private static final String FIND_PERIOD_COUNT = "select act_no "
			+ ", mem_no, act_type_no, act_title, act_content "
			+ ", act_current_count, act_min_count, act_max_count "
			+ ", act_enroll_begin, act_enroll_end, act_start "
			+ ", act_end, act_loc, act_pl, (act_rate_sum / act_eval_sum) as avgStar, act_status "
			+ "from act where act_max_count >= ? and act_max_count <= ?";
	
	@Override
	public void insert(ActVO actVO) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(INSERT)) {
			ps.setInt(1, actVO.getMen_no());
			ps.setInt(2, actVO.getAct_type_no());
			ps.setString(3, actVO.getAct_title());
			ps.setString(4, actVO.getAct_content());
			ps.setInt(5, actVO.getAct_current_count());
			ps.setInt(6, actVO.getAct_min_count());
			ps.setInt(7, actVO.getAct_max_count());
			ps.setObject(8, actVO.getAct_enroll_begin());
			ps.setObject(9, actVO.getAct_enroll_end());
			ps.setObject(10, actVO.getAct_start());			
			ps.setObject(11, actVO.getAct_end());
			ps.setInt(12, actVO.getAct_loc());			
			ps.setString(13, actVO.getAct_pl());
			ps.setInt(14, actVO.getAct_rate_sum());
			ps.setInt(15, actVO.getEval_sum());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(ActVO actVO) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(UPDATE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void updateActStatus(Integer actStatus) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(UPDATE_ACT_STATUS)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public List<ActVO> getAll() {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ALL)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> getHostAct(Integer memNo) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_HOST_ACT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findActByType(Integer actTypeNo) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_ACT_BY_TYPE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findActByAEB(LocalDateTime actEnrollBegin) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_AEB)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findActByAEE(LocalDateTime actEnrollEnd) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_AEE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findActByAEBE(LocalDateTime actEnrollBegin, LocalDateTime actEnrollEnd) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_AEBE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findActByASBE(LocalDateTime actStart, LocalDateTime actEnd) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_ASBE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> getActEvalAvg(Integer actRateSum, Integer actEvalSum) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ACT_EVAL_AVG)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> getActLoc(Integer actLoc) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ACT_LOC)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> getASET(LocalDateTime actStart, LocalDateTime actEnd) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ASET)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<ActVO> findActByMinCount(Integer minCount) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_ACT_BY_MIN_COUNT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findActByMaxCount(Integer maxCount) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_ACT_BY_MAX_COUNT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	@Override
	public List<ActVO> findPeriodCount(Integer minCount, Integer maxCount) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_PERIOD_COUNT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		return null;
	}

	// ====== Main ======
	public static void main(String[] args) {
		ActJDBCDAO actJBCDDAO = new ActJDBCDAO();
		
		// insert
		ActVO actVO1 = new ActVO();
		actVO1.setMen_no(1);
		actVO1.setAct_type_no(2);
		actVO1.setAct_title("羽球團");
		actVO1.setAct_content("歡迎新手加入，一起運動趣!");
		actVO1.setAct_current_count(1);
		actVO1.setAct_min_count(4);
		actVO1.setAct_max_count(100);
		actVO1.setAct_enroll_begin(LocalDateTime.of(2022,10,10,14,00,00));
		actVO1.setAct_enroll_end(LocalDateTime.of(2022,10,18,14,00,00));
		actVO1.setAct_start(LocalDateTime.of(2022,10,20,14,00,00));
		actVO1.setAct_end(LocalDateTime.of(2022,10,20,14,00,00));
		actVO1.setAct_loc(0);
		actVO1.setAct_pl("中山區 中山國小 羽球場");
		actVO1.setAct_rate_sum(18);
		actVO1.setEval_sum(4);
		actJBCDDAO.insert(actVO1);
		
		//
		
	}

}
