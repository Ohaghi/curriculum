package com.florestacausa.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	@RequestMapping(value="/")
	String sample(Model model) {
		model.addAttribute("name", "ともみ");
		return "ciao";
	}
}
