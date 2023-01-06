package com.jdc.pagi.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jdc.pagi.root.dto.Employee;
import com.jdc.pagi.root.service.EmployeeService;

@Controller
@RequestMapping({ "/home" })
public class HomeController {

	@Autowired
	private EmployeeService empService;

	/**
	 * 
	 * when client access first time to application, this '@GetMapping' handler will invoke
	 * 
	 */
	@GetMapping
	public ModelAndView index(ModelAndView mv) {
		int total = 5;

		// int pageId = page_id == 1 ? 1 : (page_id - 1)*total + 1;
		List<Employee> list = empService.getEmployeesByPage(1, total);

		mv.addObject("list", list);
		mv.setViewName("home");

		return mv;
	}

	/**
	 * 
	 * when client click other links in our application, this '@GetMapping' handler will invoke
	 * 
	 */
	@RequestMapping(value = "/init/{page_id}", method = RequestMethod.GET)
	public ModelAndView otherPage(@PathVariable int page_id, ModelAndView mv) {
		int total = 5;

		int pageId = page_id == 1 ? 1 : (page_id - 1)*total + 1;
		List<Employee> list = empService.getEmployeesByPage(pageId, total);

		mv.addObject("list", list);
		mv.setViewName("home");

		return mv;

	}
}
