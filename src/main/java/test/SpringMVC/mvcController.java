package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class mvcController {
	//@RequestMapping("/hello")
	//@GetMapping
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("aaa");
		return "hello";
	}
}
