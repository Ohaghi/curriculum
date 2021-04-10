package com.florestacausa.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/florestacausa/")
public class FlorestaController {

	@GetMapping("login")
	public String login(Model model) {
		return "login";
	}
	@GetMapping("top")
	public String top(Model model) {
		return "top";
	}


}
