package com.jdc.pagi.root.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.pagi.root.dto.Employee;
import com.jdc.pagi.root.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> getEmployeesByPage(int pageId, int total) {
		return repo.getEmpByPage(pageId, total);
	}
}
