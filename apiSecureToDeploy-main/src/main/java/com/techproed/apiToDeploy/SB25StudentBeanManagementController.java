package com.techproed.apiToDeploy;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB25StudentBeanManagementController {
	
	private final SB22StudentBeanService studentService;
	@Autowired
	public SB25StudentBeanManagementController(SB22StudentBeanService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path = "/management/api/v1/students")
	@PreAuthorize("hasAnyRole('ROLE_STUDENT', 'ROLE_TEACHER')")
	public List<SB20StudentBean> getStudentList(){
		return SB22StudentBeanService.getStudents();
	}
	
	@GetMapping(path = "/management/api/v1/students/{studentId}")
	@PreAuthorize("hasAnyRole('ROLE_STUDENT', 'ROLE_TEACHER')")
	public Optional<SB20StudentBean> getStudentById(@PathVariable(value = "studentId") Long studentId) {
		return SB22StudentBeanService.getStudentById(studentId);
	}
	
	@PostMapping(path = "/management/api/v1/students")
	@PreAuthorize("hasAuthority('teacher:write')")
	public void insertNewStudent(@RequestBody SB20StudentBean student) {
		SB22StudentBeanService.addNewStudent(student);
	}
	
	@DeleteMapping(path = "/management/api/v1/delete/{studentId}")
	@PreAuthorize("hasAuthority('teacher:write')")
	public String deleteStudentById(@PathVariable(value = "studentId") Long studentId) {
		return SB22StudentBeanService.deleteStudentById(studentId);
	}
	
	@PutMapping(path = "/management/api/v1/update/{studentId}")
	@PreAuthorize("hasAuthority('teacher:write')")
	public ResponseEntity<SB20StudentBean> updateStudentById(@PathVariable(value = "studentId") Long studentId, @Validated @RequestBody SB20StudentBean newStudent) {
		return ResponseEntity.ok(SB22StudentBeanService.updateStudent(studentId, newStudent));
	}
	
	@PatchMapping(path = "/management/api/v1/updatePartially/{studentId}")
	@PreAuthorize("hasAuthority('teacher:write')")
	public ResponseEntity<SB20StudentBean> updateStudentPartiallyById(@PathVariable(value = "studentId") Long studentId, @Validated @RequestBody SB20StudentBean newStudent) {
		return ResponseEntity.ok(SB22StudentBeanService.updateStudentPartially(studentId, newStudent));
	}

}
