/*package com.example.moban;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.User;

@Controller
public class YinQing {
//都是做前后台的数据绑定。例如jsp,jstl,list.map.sting,int
	//语法
	//1#{...}把你properties里的数据放进去
	//@{}value,linked,a标签等.
    //${}获取值
	@RequestMapping("/index")
	@ResponseBody
	public  String  liu(HttpServletRequest req) {
		HttpSession session = req.getSession();
        session.setAttribute("name", "liuyuting");
		return "index";
	}
	//生成一个list集合，使用model传值，前台页面使用thymeleaf获取list
	@RequestMapping("/testlist")
	@ResponseBody
	public String Test(Model model) {
		List<User>list= Arrays.asList();
		 for(int i=0;i<10;i++) {
				User u= new User();
				u.setId(i);
				u.setName(i+"liu");			
		 }		  
		 model.addAttribute("list",list);
		return "testlist";
		
	}
	
	@RequestMapping("/tst")
	@ResponseBody
	public String us() {
		
		return null;
	}
	
	
}*/
