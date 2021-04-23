package com.techproed.restapi02;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component aanottaion works 
@Service
public class SB09StudentBeanService {

	//I'm accessing this method from controller class by using object
	public List<SB07StudentBean> getStudentList(){
		return List.of(
					new SB07StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002, Month.JANUARY,12), 19),
					new SB07StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2000, Month.JANUARY,12), 21),
					new SB07StudentBean(103L, "MAry Star", "ms@gmail.com", LocalDate.of(2010, Month.JANUARY,12), 11)
							);
}

}