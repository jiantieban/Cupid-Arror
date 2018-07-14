package org.cupid.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("TestController")
@RequestMapping("TestController")
public class TestController {
	
	@RequestMapping("testSpringMVC.do")
	@ResponseBody
	public String testSpringMvc() {
		System.out.println("in testSpringMVC");
		return "SpringMVC test OK!";
	}
}
