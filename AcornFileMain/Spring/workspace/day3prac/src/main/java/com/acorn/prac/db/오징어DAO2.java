package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 오징어DAO2 {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbCon() {

		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public ArrayList<오징어> selectAll() {

		Connection con = dbCon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<오징어> list = new ArrayList<오징어>();

		String sql = " select * from member_tbl_11";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);

				오징어 person = new 오징어();
				person.setM_id(id);
				person.setM_pw(pw);
				person.setM_name(name);

				list.add(person);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, pst, con);
		}

		//
		return list;

	}
	
	public void close(AutoCloseable ...autoCloseables) {
		for(AutoCloseable item:autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		오징어DAO2 dao = new 오징어DAO2();
		ArrayList<오징어> list = dao.selectAll();
		list.forEach(item -> System.out.println(item));
	}

}
