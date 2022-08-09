package com.testany.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DataSourceUtil;
import com.mysql.cj.jdbc.MysqlDataSource;

/*
 * 專案不使用此連線方式，請勿使用！
 * 統一使用　JNDI，配置檔已改好，測試請使用TestJndi&emp2
 */
public class TestDsConn {

//	public static void main(String[] args) {
//		TestDsConn dsCon = new TestDsConn();
//		try {
//			dsCon.displayEmployee();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

//	private void displayEmployee() throws SQLException {

//		Connection connection = null;
//		String selectSQL = "Select * from student";
//		PreparedStatement prepStmt = null;
//		try {
//			MysqlDataSource basicDS = DataSourceUtil.getInstance().getMySqlDS();
//			connection = basicDS.getConnection();
//			prepStmt = connection.prepareStatement(selectSQL);
//   prepStmt.setInt(1, id);
//			ResultSet rs = prepStmt.executeQuery();
//			while (rs.next()) {
//				System.out.println("id : " + rs.getInt("id") + "\n" + "fisrt Name :" + rs.getString("first_name") + "\n"
//						+ "last Name :" + rs.getString("last_name") + "\n" + "section :" + rs.getString("section")
//						+ "\n");
//			}
//		} finally {
//			if (prepStmt != null) {
//				prepStmt.close();
//			}
//			if (connection != null) {
//				connection.close();
//			}
//		}
//	}
}