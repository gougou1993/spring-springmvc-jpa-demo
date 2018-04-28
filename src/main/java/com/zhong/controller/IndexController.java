package com.zhong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhong.entity.User;

@RestController
public class IndexController {

	@RequestMapping(value = "login")
	public String login(HttpServletRequest request, String username) {
		User user = new User();
		user.setName(username);
		request.getSession().setAttribute("user", user );
		return "login";
	}

	@RequestMapping(value = "index")
	public String index(HttpServletRequest request, Model model) {

		return "index";
	}
}
