package online.shixun.project.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import online.shixun.project.entity.DefaultUser;
import online.shixun.project.entity.SimpleUser;

@Controller
@RequestMapping(value = "user")
public class UserController {
	//localhost:8080/SpringMVCRegister/user/simple
	@RequestMapping("{userType}")
	public  String registerPage(Model model, @PathVariable String userType) {
		System.out.println("进入" + userType + "用户注册界面。。。");
		return userType + "Register";
	}

	@RequestMapping(value = "simpleUserRegister", method = RequestMethod.POST)
	public String simpleUserRegister(ModelMap model,@Valid SimpleUser simpleUser,BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			model.addAttribute("mess", "注册失败，请检查数据有效性！");
			return "simpleRegister";
		}
		else{
			model.addAttribute("mess","用户登陆成功");
			return "registerSuccess";
		}
	}
	@RequestMapping(value = "defaultUserRegister", method = RequestMethod.POST)
	public String defaultUserRegister(ModelMap model,@Valid DefaultUser defaultUser,BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			model.addAttribute("mess","注册失败，请检查数据的有效性");
			return "defaultRegister";
		}
		else{
			model.addAttribute("mess","用户登陆成功");
			return "registerSuccess";
		}
	}
}
