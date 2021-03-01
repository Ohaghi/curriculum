package com.florestacausa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.florestacausa.demo.bean.Samplebean;
import com.florestacausa.demo.service.SampleService;

@RestController
public class SampleController {
	@Autowired
	SampleService sampleService;

	@GetMapping(value = "create")
	ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello");
		mav.setViewName("index");
		return mav;
	}

	@GetMapping(value = "/create")
	public String list(Model model) {
		List<Samplebean> member = sampleService.findAll();
		model.addAttribute("member", member);
		return "signin";
	}

	@GetMapping(value="/")
	String create(@ModelAttribute Samplebean samplebean) {
        return "create";
    }



}