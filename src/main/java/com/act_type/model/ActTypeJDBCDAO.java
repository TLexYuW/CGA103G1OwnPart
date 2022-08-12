package com.act_type.model;

import static com.util.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ActTypeJDBCDAO implements I_ActTypeDAO {

	private static final String INSERT = "";
	
	private static final String UPDATE = "";
	
	private static final String GET_ALL = "";
	
	private static final String GET_ONE_BY_PK = "";

	@Override
	public void insert(ActTypeVO actTypeVO) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(INSERT)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public void update(ActTypeVO actTypeVO) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(UPDATE)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public List<ActTypeVO> getAll() {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ALL)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public ActTypeVO getOneByPk(Integer actTypeNo) {
		try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = conn.prepareStatement(GET_ONE_BY_PK)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public static void main(String[] args) {
		
	}
}
