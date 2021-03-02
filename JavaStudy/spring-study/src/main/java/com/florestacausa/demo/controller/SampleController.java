package com.florestacausa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.florestacausa.demo.bean.Samplebean;
import com.florestacausa.demo.service.SampleService;

@RestController
public class SampleController {
	@Autowired
	SampleService sampleService;
    //ModelAndViewの使い方確認を入力フォームと同じ画面に設置
	@GetMapping(value = "/")
	ModelAndView sample() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello");
		mav.setViewName("signin");
		return mav;
	}

	@GetMapping(value = "/create")
	public String list(Model model) {
		List<Samplebean> member = sampleService.findAll();
		model.addAttribute("member", member);
		return "signin";
	}

	@GetMapping(value="/")
	String index(@ModelAttribute Samplebean samplebean) {
        return "index";
    }

	@PostMapping(value="/create")
    public String create(@ModelAttribute Samplebean samplebean) {
        sampleService.save(samplebean);
        return "redirect:/";
    }

}