package com.techproed.springmvctutorial;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techproed.modelattribute.Student;

@Controller
public class ResultController {
	
	//1.Way
//	@RequestMapping("add")
//	public String addAndMultiplyNums1(HttpServletRequest req) {
//		
//		int a = Integer.parseInt(req.getParameter("n1"));
//		int b = Integer.parseInt(req.getParameter("n2"));
//		int sum = a + b;
//		int product = a * b;
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("sumOfNumbers", sum);
//		session.setAttribute("productOfNumbers", product);
//		
//		return "result.jsp";
//	}
	
	//2.Way
//	@RequestMapping("add")
//	public String addAndMultiplyNums2(@RequestParam("n1") int a, @RequestParam("n2") int b, HttpSession session) {
//		
//		int sum = a + b;
//		int product = a * b;
//		
//		session.setAttribute("sumOfNumbers", sum);
//		session.setAttribute("productOfNumbers", product);
//		
//		return "result.jsp";
//	}
	
	
	//3.Way
//		@RequestMapping("add")
//		public ModelAndView addAndMultiplyNums3(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//			
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("result.jsp");
//			
//			int sum = a + b;
//			int product = a * b;
//			
//			mv.addObject("sumOfNumbers", sum);
//			mv.addObject("productOfNumbers", product);
//			
//			return mv;
//		}
		

	//****************************************************************************
	
	//1.way
//	@RequestMapping("addStudents")
//	public String addStudent1(@RequestParam("id") int id, @RequestParam("name") String name, Model m) {
//		
//		Student student = new Student();
//		student.setId(id);
//		student.setName(name);
//		
//		m.addAttribute("studentObject", student);
//		
//		return "result";
//	}
	
	//2. way
//	@RequestMapping("addStudents")
//	public String addStudent2(@ModelAttribute Student student, Model m) {
//		
//		m.addAttribute("studentObject", student);
//		
//		return "result";
//	}
	
	//3. way
	//studentObject==> attribute name
	//How to get a specific data from object
	//You need to use @RequestMapping("addStudents") first then use @ModelAttribute
//	@RequestMapping("addStudents") //@RequestMapping support get and post
//	public String addStudent3(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStd", student.getName());
//	}
	//4.way
	//How to use POST request
	
	//1. way of using Post request

//	@RequestMapping(value = "addStudents", method = RequestMethod.POST) 
//	public String addStudent4(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStd", student.getName());
//	}
	
	
	//2. way of using Post request
//	@PostMapping("addStudents")
//	public String addStudent5(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStd", student.getName());
//	}
	
	//5. way
	//How to use Get request
//	@GetMapping("getStudents") 
//	public String getStudents(Model m) {
//		
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(101, "Ali Can"));
//		students.add(new Student(102, "Mary Star"));
//		students.add(new Student(103, "Angie Ocean"));
//		students.add(new Student(104, "Veli Han"));
//		students.add(new Student(105, "Tom Hanks"));
//		
//		m.addAttribute("studentList", students);
//		
//		return "showStudents";
//		
//		}
	
	//How to get a specific 
	@GetMapping("getStudentWithId")
	public String getSpecificStudent(@RequestParam("id") int id, Model m) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Ali Can"));
		students.add(new Student(102, "Mary Star"));
		students.add(new Student(103, "Angie Ocean"));
		students.add(new Student(104, "Veli Han"));
		students.add(new Student(105, "Tom Hanks"));
		
		return "result";
	}
	
	
	
}
