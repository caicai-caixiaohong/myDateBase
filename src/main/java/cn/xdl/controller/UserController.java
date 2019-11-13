package cn.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xdl.bean.User;
import cn.xdl.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/toLogin.do")
	public String toLogin() {
		return "login";
	}
	@RequestMapping("/login.do")
	public String login(String name,String password,HttpServletRequest request) {
		User user = userService.login(name, password);
		if(user!=null) {
			request.getSession().setAttribute("user", user);
			return "index";
		}
		request.setAttribute("msg", "µÇÂ¼Ê§°Ü£¡");
		return "login";
	}
	
}












