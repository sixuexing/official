package com.sxx.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.assertj.core.data.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.sxx.domain.User;
import com.sxx.filter.WebSecurityConfig;
import com.sxx.service.IUserService;

@Controller
public class LoginController {
	@Autowired
	private IUserService userService;
	
	
	@RequestMapping("/")
	public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY)String account,Model model) {
		model.addAttribute(account);
		return "Userlogin";
	}
	@RequestMapping("/login")
	public String login() {
		return "login/login";
	}
	
	@RequestMapping("/Userlogin")
	public String userLogin(HttpServletRequest request,HttpSession session) {
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		User user = userService.login(name, pwd);
		session.setAttribute("account", WebSecurityConfig.SESSION_KEY);
		if(null != user) {
			return "main";
		}
		return "login/login";
		
	}
	 /**
     * 退出登录
     * @param session
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
        session.removeAttribute("account");
        return "redirect:/Userlogin";
    }

}
