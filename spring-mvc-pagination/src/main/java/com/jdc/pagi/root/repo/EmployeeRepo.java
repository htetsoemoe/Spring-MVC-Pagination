package com.jdc.pagi.root.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdc.pagi.root.dto.Employee;

@Repository
public class EmployeeRepo {
	
	@Autowired
	private JdbcTemplate template;
	
	public List<Employee> getEmpByPage(int pageId, int total) {
		String sql = "select * from employee limit " + (pageId - 1) + "," + total;
		
		return template.query(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				
				emp.setId(rs.getInt("employee_id"));
				emp.setName(rs.getString("employee_fullname"));
				emp.setPosition(rs.getString("employee_position"));
				emp.setSalary(rs.getInt("employee_salary"));
				
				return emp;
			}
			
		});
		
	}

}
