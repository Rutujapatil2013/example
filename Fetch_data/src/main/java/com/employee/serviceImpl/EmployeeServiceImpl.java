package com.employee.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import com.employee.DBUtil.DBUtil;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	static List<Employee> employeelist=new ArrayList();
	
	Connection connection;
	
	public EmployeeServiceImpl() throws SQLException {
		connection = DBUtil.getConnection();
	}
	
	@Override
	public List<Employee> getEmployeeData(){
		
		try {
			PreparedStatement stmt=connection.prepareStatement("SELECT *FROM EMPLOYEE_DATA");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				Employee empy=new Employee();
			 	empy.setName(rs.getString(1));
			 	empy.setMail(rs.getString(2));
			 	empy.setNumber(rs.getInt(3));
			 	empy.setState(rs.getString(4));
			 	empy.setJobrole(rs.getString(5));
			 	employeelist.add(empy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeelist;
	}

	
}
