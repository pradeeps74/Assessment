package com.vastpro.studentCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	private static final String DB_DRIVER_ClASs = "org.postgresql.Driver";
	private static final String DB_URL = "jdbc:postgresql://Localhost:5432/vastpro";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "postgres";
	public static String INSERT="insert into Employee (Id,empId,name,age,designation,phoneno,salary) values(?,?,?,?,?,?,?)";
	public static String UPDATE="update Employee set salary=?,designation=? where empId=?;";
	public static String DELETE="delete from Employee where empId=?";
	public static String SELECT="select * from Employee where salary >='300000';";

	public static Connection getConnection() throws SQLException {

		try {
			Class.forName(DB_DRIVER_ClASs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return connection;

	}
	public  static int insertEmployee(Employee e) throws SQLException {
		int status = 0;
	
		try {
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps =con.prepareStatement(INSERT);
		ps.setInt(1, e.getId());
			ps.setString(2,e.getEmpId());
			ps.setString(3, e.getEmpName());
			ps.setString(4, e.getEmpAge());
			ps.setString(5, e.getEmpDesignation());
			ps.setString(6,  e.getEmpPhoneNumber());
			ps.setString(7, e.getEmpSalary());
			status=ps.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return status;
	}
	public static int update(Employee e) {
		int status = 0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE);
			ps.setString(1, e.getEmpSalary());
			ps.setString(2, e.getEmpDesignation());
			ps.setString(3, e.getEmpId());
			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return status;
	}

	public static int delete(String sid) {
		int status = 0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETE);
			ps.setString(1,sid);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static Employee getEmployeeById(String sid) {
		Employee e = new Employee();
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Employee where empIdAZ=?");
			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				e.setId(rs.getInt(1));
				e.setEmpId(rs.getString(2));
				e.setEmpName(rs.getString(3));
				e.setEmpAge(rs.getString(4));
				e.setEmpDesignation(rs.getString(5));
				e.setEmpPhoneNumber(rs.getString(6));
				e.setEmpSalary(rs.getString(7));
			
				
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return e;
	}

	public static List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement(SELECT);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setEmpId(rs.getString(2));
				e.setEmpName(rs.getString(3));
				e.setEmpAge(rs.getString(4));
				e.setEmpDesignation(rs.getString(5));
				e.setEmpPhoneNumber(rs.getString(6));
				e.setEmpSalary(rs.getString(7));
			
				
				list.add(e);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
