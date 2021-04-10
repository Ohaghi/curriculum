package com.florestacausa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.florestacausa.demo.bean.Samplebean;
import com.florestacausa.demo.service.SampleService;

@Controller
@RequestMapping("/")
public class SampleController {
	@Autowired
	SampleService sampleService;
//入力したメンバーの一覧
	@GetMapping
	public String index(Model model) {
		List<Samplebean> members = sampleService.findAll();
		model.addAttribute("members", members);
		return "index";
	}
//新規メンバー入力画面
	@GetMapping("new")
	public String newMember(Model model) {
		return "signin";
	}
//新規メンバーを入力する際の遷移先
	@PostMapping("create")
	public String create(@ModelAttribute Samplebean samplebean) {
		sampleService.save(samplebean);
		return "redirect:/";
	}
//メンバーごとの編集画面
	@GetMapping("{id}")
		public String show(@PathVariable Integer id,Model model) {
			  sampleService.findOne(id).ifPresent(o -> model.addAttribute("member",o));
			  return "show";
	}
//編集
	@PutMapping("{id}")
		public String update(@PathVariable Integer id,@ModelAttribute Samplebean samplebean){
		samplebean.setId(id);
		sampleService.save(samplebean);
		return "redirect:/";
	}
//削除
	@DeleteMapping("{id}")
		public String delete(@PathVariable Integer id) {
		sampleService.delete(id);
		return "redirect:/";
	}

}