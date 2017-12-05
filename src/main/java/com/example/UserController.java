package com.example;

import java.io.IOException;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//RestController

public class UserController {

	@RequestMapping("/user")

	public List user() {
		return Arrays.asList(
				
						new User("a", 35, 66), 
						new User("b", 45, 88),
						new User("c", 25, 99));	
	       }
	
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/json")
	public String json() {
		return "json";
	}
	@RequestMapping(value="/post",method=RequestMethod.POST)
	@ResponseBody
	//@RequestBody可以将请求中的json字符串绑定到相应的bean或字符串上
	public String getBean( @RequestParam String json) throws JsonParseException, JsonMappingException, IOException{
		//ObjectMapper的功能是非常强大的
		ObjectMapper om = new ObjectMapper();
		System.out.println(om);
		User user = om.readValue(json, User.class);
		System.out.println(user);
		return "111";
	}
}
