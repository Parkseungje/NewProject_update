package com.example.selfmade.userRegisteration;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRegisteration {

	@Autowired
	UserRegisterationService userRegisterationService;

	@GetMapping("/userRegisteration")
	public String userRegisteration() {
		return "userRegisteration";
	}
	/* 이 방법보다 아래의 @PostMapping("/jointest") 방법이 편하다
	@PostMapping("/joinStart")
	public String joinStart(HttpServletRequest httpServletRequest, Model model) {

		String name = httpServletRequest.getParameter("name");
		String id = httpServletRequest.getParameter("id");
		String password = httpServletRequest.getParameter("password");
		String email = httpServletRequest.getParameter("email");



		model.addAttribute("name", name);
		model.addAttribute("id", id);
		model.addAttribute("password", password);
		model.addAttribute("email", email);

		System.out.println(model.getAttribute("name"));

		return "userRegisteration";
	}
	*/

	// 가입
	@PostMapping("/jointest")
	public String joinTest(UserRegisterationModel user) {
		userRegisterationService.joinMember(user);

		return "userRegisteration";
	}


	// 조회
	@GetMapping("/test")
	@ResponseBody
	public List<UserRegisterationModel> getTest() {
		List<UserRegisterationModel> list = userRegisterationService.findUser();
		return list;
	}

}
