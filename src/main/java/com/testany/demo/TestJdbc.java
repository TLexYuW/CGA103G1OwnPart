package com.testany.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.util.JdbcUtil.*;

/*
 * 專案不使用此連線方式，請勿使用！
 * 統一使用　JNDI，配置檔已改好，測試請使用TestJndi&emp2
 */
public class TestJdbc {

	public static void main(String[] args) {

		try {
			System.out.println("Connecting to database: " + URL);
			
			Connection myConnection = 
					DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			System.out.println("Connection successfully!!");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
