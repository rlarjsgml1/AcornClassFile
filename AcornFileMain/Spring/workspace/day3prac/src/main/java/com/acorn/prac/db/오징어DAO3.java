package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class 오징어DAO3 {

	@Autowired //필드주입
	DataSource ds;
	
	public 오징어DAO3() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 주입
	
	//세터주입
	
	public ArrayList<오징어> selectAll() throws SQLException {

		Connection con = ds.getConnection();
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
	
	public static void main(String[] args) throws SQLException {
		오징어DAO3 dao = new 오징어DAO3();
		ArrayList<오징어> list = dao.selectAll();
		list.forEach(item -> System.out.println(item));
	}

}
