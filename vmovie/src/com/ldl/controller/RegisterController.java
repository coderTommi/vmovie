package com.ldl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(value = "/doIt")
	public ModelAndView register(
			@RequestParam(value = "userId", required = true) String userId,
			@RequestParam(value = "aliasName", required = true) String aliasName,
			@RequestParam(value = "userPwd", required = true) String userPwd,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "gender", required = true) String gender
			) throws Exception {
		
		
		return new ModelAndView("registerSuc");
	}

}
