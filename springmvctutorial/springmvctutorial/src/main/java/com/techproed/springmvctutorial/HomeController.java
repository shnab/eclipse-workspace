package com.techproed.springmvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping ("/") // Burasi homepage controller sadece.00
	public String home() {
		return "index.jsp";
	}
	
}
