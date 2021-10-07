package com.example.selfmade.userRegisteration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegisteration {

	@GetMapping("/userRegisteration")
	public String userRegisteration() {
		return "userRegisteration";
	}

	@PostMapping("/joinStart")
	public String joinStart() {

		return "main";
	}
}
