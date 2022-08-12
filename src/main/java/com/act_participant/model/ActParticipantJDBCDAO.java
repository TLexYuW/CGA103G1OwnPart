package com.act_participant.model;

import static com.util.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ActParticipantJDBCDAO implements I_ActParticipantDAO {
	
	private static final String INSERT = "";
	
	private static final String UPDATE = "";
	
	private static final String GET_ALL = "";
	
	private static final String GET_ONE_OF_ACT_PARTICIPANT = "";
	
	private static final String GET_APES = "";
	
	@Override
	public void insert(ActParticipantVO actParticipantVO) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(INSERT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}
	@Override
	public void update(ActParticipantVO actParticipantVO) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(UPDATE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}
	@Override
	public List<ActParticipantVO> getAll() {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ALL)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}
	@Override
	public List<ActParticipantVO> getAll(Integer ActNo) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ONE_OF_ACT_PARTICIPANT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return null;
	}
	@Override
	public ActParticipantVO getAPES() {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_APES)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public static void main(String[] args) {
		
	}
}
