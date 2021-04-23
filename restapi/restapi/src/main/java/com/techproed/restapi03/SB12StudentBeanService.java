package com.techproed.restapi03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SB12StudentBeanService {

	private final SB11StudentBeanRepository studentRepository; //object creation to connect database
	
	@Autowired
	public SB12StudentBeanService (SB11StudentBeanRepository studentRepository)  {
		this.studentRepository = studentRepository;
	}
	
	public List<SB10StudentBean> getStudentList(){
		return studentRepository.findAll();
	}
}
