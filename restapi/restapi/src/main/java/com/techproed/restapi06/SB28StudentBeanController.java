package com.techproed.restapi06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB28StudentBeanController {

	private final SB27StudentBeanService studentService;
	
	@Autowired
	public SB28StudentBeanController(SB27StudentBeanService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path=  "api/v1/students") //to get student
	public List<SB25StudentBean> studentList(){
		return studentService.getStudents();
	}
	
	
	
	@PostMapping(path = "api/v1/students") //to add new student
	public SB25StudentBean insertNewStudent (@RequestBody SB25StudentBean student) {
		return SB27StudentBeanService.addNewStudent(student);
		
	}
	
	@DeleteMapping(path=  "api/v1/students/delete/{studentId}") //delete student with parametarization
	public String deleteStudentById(@PathVariable(value ="studentId") Long studentId){
		return studentService.deleteStudentById(studentId);
	}
	
	@PutMapping(path = "api/v1/students/update/{studentId}")
	public SB25StudentBean updateStudent(@PathVariable(value ="studentId") Long studentId, @RequestBody SB25StudentBean student){
		return studentService.updateStudentById(studentId, student);
	}
	
}
