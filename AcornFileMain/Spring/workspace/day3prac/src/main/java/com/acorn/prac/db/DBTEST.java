package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<오징어> list = new ArrayList<오징어>();

		// try( )
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from member_tbl_11";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			//

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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		list.forEach(item -> System.out.println(item));

	}

}
