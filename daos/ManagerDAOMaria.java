package dev.brandow.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dev.brandow.entities.Manager;
import dev.brandow.utils.ConnectionUtil;

public class ManagerDAOMaria implements ManagerDAO {
	
	@Override
	public Manager getManagerByUsername(String username) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.MANAGER WHERE USERNAME = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();
			rs.next();

			Manager manager = new Manager();
			manager.setManID(rs.getInt("MAN_ID"));
			manager.setUsername(rs.getString("USERNAME"));
			manager.setPassword(rs.getString("PASSWORD"));

			return manager;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
