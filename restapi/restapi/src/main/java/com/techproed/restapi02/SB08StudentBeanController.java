package com.techproed.restapi02;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB08StudentBeanController {

	private final SB09StudentBeanService studentService; //created an object
	
	@Autowired //==> For the contructor you need to put autowired. autowired control first if we have an object there or not
	public SB08StudentBeanController(SB09StudentBeanService studentService) {
		this.studentService = studentService;
	}
	
	//that part just controlling the request. I called getStudentList(); method from here
	@GetMapping(path = "/api/v1/students")
	public List<SB07StudentBean> getAllStudents(){
		return studentService.getStudentList();
	}
}
