package com.example.selfmade.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

	@GetMapping("/")
	public String mainPage() {
		return "main";
	}

}
