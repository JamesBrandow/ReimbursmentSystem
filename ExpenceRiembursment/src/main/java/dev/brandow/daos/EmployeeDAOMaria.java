package dev.brandow.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.brandow.entities.Employee;
import dev.brandow.entities.Manager;
import dev.brandow.utils.ConnectionUtil;

public class EmployeeDAOMaria implements EmployeeDAO{

	public Employee getEmployeeByUsername(String username) {
		
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.EMPLOYEE WHERE USERNAME = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();
			rs.next();

			Employee employee = new Employee();
			employee.setEmpID(rs.getInt("EMP_ID"));
			employee.setUsername(rs.getString("USERNAME"));
			employee.setPassword(rs.getString("PASSWORD"));
			employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
			employee.setManID(rs.getInt("MAN_ID"));

			return employee;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Employee> getEmployeeByEmpID(int empID) {
		
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.EMPLOYEE WHERE EMP_ID = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empID);

			ResultSet rs = ps.executeQuery();
			rs.next();

			List<Employee> emp = new ArrayList<Employee>();
			
			while(rs.next()) {
			Employee employee = new Employee();
			employee.setEmpID(rs.getInt("EMP_ID"));
			employee.setUsername(rs.getString("USERNAME"));
			employee.setPassword(rs.getString("PASSWORD"));
			employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
			employee.setManID(rs.getInt("MAN_ID"));
			emp.add(employee);
			}
			return emp;
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.EMPLOYEE";

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<Employee> accounts = new ArrayList<Employee>();
			
			while(rs.next()) {
			
			Employee employee = new Employee();
			employee.setEmpID(rs.getInt("EMP_ID"));
			employee.setUsername(rs.getString("USERNAME"));
			employee.setPassword(rs.getString("PASSWORD"));
			employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
			employee.setManID(rs.getInt("MAN_ID"));

			accounts.add(employee);
			}
			return accounts;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployeeByEmpName(String empName) {
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.EMPLOYEE WHERE EMPLOYEE_NAME = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, empName);

			ResultSet rs = ps.executeQuery();
			rs.next();

			Employee employee = new Employee();
			employee.setEmpID(rs.getInt("EMP_ID"));
			employee.setUsername(rs.getString("USERNAME"));
			employee.setPassword(rs.getString("PASSWORD"));
			employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
			employee.setManID(rs.getInt("MAN_ID"));

			return employee;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee employeLogin(String username, String password) {
		
		try (Connection conn = ConnectionUtil.createConnection()) {

			String sql = "SELECT * FROM project1db.EMPLOYEE WHERE USERNAME = ? && PASSWORD = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();
			rs.next();

			Employee employee = new Employee();
			employee.setEmpID(rs.getInt("EMP_ID"));
			employee.setUsername(rs.getString("USERNAME"));
			employee.setPassword(rs.getString("PASSWORD"));
			employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
			employee.setManID(rs.getInt("MAN_ID"));

			return employee;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
