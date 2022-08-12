package com.act.model;

import static com.util.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class ActJBCDDAO implements I_ActDAO{
	
	private static final String INSERT = "insert into act( "
			+ "mem_no, act_type_no, act_title, "
			+ "act_content,  "
			+ "act_current_count, act_min_count, act_max_count,  "
			+ "act_enroll_begin, act_enroll_end, act_start, act_end, "
			+ "act_loc, act_pl, "
			+ "act_rate_sum, act_eval_sum, act_status) "
			+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String UPDATE = "";
	
	private static final String UPDATE_ACT_STATUS = "";
	
	private static final String GET_ALL = "";
	
	private static final String GET_HOST_ACT = "";
	
	private static final String FIND_ACT_BY_TYPE = "";
	
	private static final String FIND_AEB = "";
	
	private static final String FIND_AEE = "";
	
	private static final String FIND_AEBE = "";
	
	private static final String FIND_ASBE = "";
	
	private static final String GET_ACT_EVAL_AVG = "";
	
	private static final String GET_ACT_LOC = "";
	
	private static final String GET_ASET = "";

	
	@Override
	public void insert(ActVO actVO) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(INSERT)) {
			
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
	public List<ActVO> findAEB(LocalDateTime actEnrollBegin) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_AEB)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findAEE(LocalDateTime actEnrollEnd) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_AEE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findAEBE(LocalDateTime actEnrollBegin, LocalDateTime actEnrollEnd) {
		try(Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_AEBE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ActVO> findASBE(LocalDateTime actStart, LocalDateTime actEnd) {
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
		
	// ====== Main ======
	public static void main(String[] args) {
		
	}

}
