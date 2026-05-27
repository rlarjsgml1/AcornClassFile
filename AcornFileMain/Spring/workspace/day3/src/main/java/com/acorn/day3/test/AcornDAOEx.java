package com.acorn.day3.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AcornDAOEx {

	@Autowired
	DataSource dataSource;

	public ArrayList<Acorn> selectAll() {
		String sql = "select id, pw, name from acorntbl";
		ArrayList<Acorn> list = new ArrayList<>();

		try (Connection con = dataSource.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()) {

			while (rs.next()) {
				list.add(new Acorn(rs.getString("id"), rs.getString("pw"), rs.getString("name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
}
