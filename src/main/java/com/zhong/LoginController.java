package com.zhong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class LoginController {

	@RequestMapping(value={"/","/login"})
	@ResponseBody
	public String login(){
		
		return "hello";
	}
}
