package dev.brandow.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dev.brandow.entities.Reimbursment;
import dev.brandow.utils.ConnectionUtil;

public class ReimbursmentDAOMaria implements ReimbursmentDAO{

	@Override
	public Reimbursment createReimbusment(Reimbursment reimbursment) {
		
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "INSERT INTO project1db.REIMBURSMENT VALUES (?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, 0);
			ps.setInt(2, reimbursment.getEmpID());
			ps.setString(3, reimbursment.getDescription());
			ps.setDouble(4, reimbursment.getAmount());
			ps.setString(5, "Pending");
			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			int key = rs.getInt("REM_ID");

			reimbursment.setEmpID(key);
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursment getRiembursmentByID(int remID) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE REM_ID = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, remID);
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			
			Reimbursment reim = new Reimbursment();
			reim.setRemid(rs.getInt("REM_ID"));
			reim.setEmpID(rs.getInt("EMP_ID"));
			reim.setDescription(rs.getString("DESCRIPTION"));
			reim.setAmount(rs.getDouble("AMOUNT"));
			reim.setStatus(rs.getString("STATUS"));
						
			return reim;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getReimbursmentByEmployee(int empID) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE EMP_ID = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empID);
			
			ResultSet rs = ps.executeQuery();
			
			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			while(rs.next()) {
				
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
						
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getAllReimbursment() {
		
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.REIMBURSMENT";

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			
			while(rs.next()) {
			
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getCompletedReimbursment() {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE (STATUS = \"Denied\" OR STATUS = \"Approved\")";

			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) {
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
			return reimbursment;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getPendingReimbursment() {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE STATUS = \"Pending\"";

			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) {
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
			return reimbursment;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getApprovedReimbursment() {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE STATUS = \"Approved\"";

			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) {
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
			return reimbursment;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getDeniedReimbursment() {
		try(Connection conn = ConnectionUtil.createConnection()){
			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE STATUS = \"Denied\"";

			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs =  ps.executeQuery();
			
			while(rs.next()) {
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
			return reimbursment;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursment updateReimbursment(Reimbursment reimbursment) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "UPDATE project1db.REIMBURSMENT SET EMP_ID = ?, DESCRIPTION = ?, AMOUNT = ?, STATUS = ? WHERE REM_ID = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, reimbursment.getEmpID());
			ps.setString(2, reimbursment.getDescription());
			ps.setDouble(3, reimbursment.getAmount());
			ps.setString(4, reimbursment.getStatus());
			ps.setInt(5, reimbursment.getRemid());
			ps.execute();
						
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteReimbursment(Reimbursment reimbursment) {
		return false;
	}

	@Override
	public List<Reimbursment> getCompletedEmpReimbursment(int empID) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE (EMP_ID = ? AND (STATUS = \"Denied\" OR STATUS = \"Approved\"))";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empID);
			
			ResultSet rs = ps.executeQuery();
			
			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			while(rs.next()) {
				
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
						
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getPendingEmpReimbursment(int empID) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE (EMP_ID = ? AND STATUS = \"Pending\")";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empID);
			
			ResultSet rs = ps.executeQuery();
			
			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			while(rs.next()) {
				
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
						
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getApprovedEmpReimbursment(int empID) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE (EMP_ID = ? AND STATUS = \"Approved\")";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empID);
			
			ResultSet rs = ps.executeQuery();
			
			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			while(rs.next()) {
				
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
						
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reimbursment> getDeniedEmpReimbursment(int empID) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.REIMBURSMENT WHERE (EMP_ID = ? AND STATUS = \"Denied\")";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empID);
			
			ResultSet rs = ps.executeQuery();
			
			List<Reimbursment> reimbursment = new ArrayList<Reimbursment>();
			while(rs.next()) {
				
				Reimbursment reim = new Reimbursment();
				reim.setRemid(rs.getInt("REM_ID"));
				reim.setEmpID(rs.getInt("EMP_ID"));
				reim.setDescription(rs.getString("DESCRIPTION"));
				reim.setAmount(rs.getDouble("AMOUNT"));
				reim.setStatus(rs.getString("STATUS"));
			reimbursment.add(reim);
			}
						
			return reimbursment;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
