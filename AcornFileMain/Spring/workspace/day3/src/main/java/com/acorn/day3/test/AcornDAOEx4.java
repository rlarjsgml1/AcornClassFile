package com.acorn.day3.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AcornDAOEx4 {

	@Autowired
	DataSource dataSource;

	public Acorn selectOne(String id) {
		String sql = "select id, pw, name from acorntbl where id = ?";

		try (Connection con = dataSource.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, id);

			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					return new Acorn(rs.getString("id"), rs.getString("pw"), rs.getString("name"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public int insert(Acorn acorn) {
		String sql = "insert into acorntbl(id, pw, name) values(?, ?, ?)";

		try (Connection con = dataSource.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, acorn.getId());
			pst.setString(2, acorn.getPw());
			pst.setString(3, acorn.getName());
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int update(Map<String, String> info) {
		String sql = "update acorntbl set pw = ? where id = ?";

		try (Connection con = dataSource.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, info.get("pw"));
			pst.setString(2, info.get("id"));
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int delete(String id) {
		String sql = "delete from acorntbl where id = ?";

		try (Connection con = dataSource.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, id);
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
}
