package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DemoController {
	@GetMapping({"/","/login"})
	public String index(){
		return "index";
	}

	@GetMapping("principal")
	public String principal() {
		return"principal";
	}
}

