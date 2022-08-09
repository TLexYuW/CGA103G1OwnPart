package com.testany.demo;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/*
 * JNDI測試，請至context.xml、web.xml 修改成自己DB帳密，參考講義
 * testdb名稱請勿更動
 */
@WebServlet("/TestJndi")
public class TestJndi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		try {
			Context ctx = new javax.naming.InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB2");
			conn = ds.getConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM EMP2");
			
			out.println("<HTML><HEAD><TITLE>Phonebook</TITLE></HEAD>");
			out.println("<BODY>");
			out.println("<UL>");
			while (rs.next()) {
				out.println("<LI>" + rs.getString(1) + " " + rs.getString(2));
			}
			out.println("</UL>");
			out.println("</BODY></HTML>");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
