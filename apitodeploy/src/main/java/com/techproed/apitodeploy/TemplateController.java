package com.techproed.apitodeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class TemplateController {

	@GetMapping("/login")
	public String getMyLoginView () {
		return "login";			
	}
	
	@GetMapping("/successPage")
	public String getSuccessView() {
		return "successPage";
	}
	
}
