package com.sxx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ueditor")
public class UeditorController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	


}
