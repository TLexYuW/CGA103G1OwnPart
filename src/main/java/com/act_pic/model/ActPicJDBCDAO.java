package com.act_pic.model;

import static com.util.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.act.model.ActVO;

public class ActPicJDBCDAO implements I_ActPicDAO {

	private static final String INSERT = "";
	private static final String UPDATE = "";
	
	private static final String FIND_ACT_PIC = "";
	
	private static final String GET_ALL = "";
	
	@Override
	public void insert(ActPicVO actPicVO) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(INSERT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}
	
	@Override
	public ActPicVO update(Integer actPicNo) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(UPDATE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	@Override
	public ActVO findActPic(byte[] actPic) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(FIND_ACT_PIC)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return null;
	}
	
	@Override
	public List<ActPicVO> getAll(byte[] actPic) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ALL)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public static void main(String[] args) {
		
	}

}
