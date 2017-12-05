package com.example.com.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	@RequestMapping("/index")
	@ResponseBody
	public String f() {
		return "接收参数";
	}
}
