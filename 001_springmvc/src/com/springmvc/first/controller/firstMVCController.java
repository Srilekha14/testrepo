package com.springmvc.first.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.portlet.ModelAndView;

@RestController
@RequestMapping("/spring")
public class firstMVCController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}

	@RequestMapping("/message")
	public String sendmessage(Model m) {
		m.addAttribute("myMessage1", "Hellow from SpringMVC");
		m.addAttribute("myMessage2", "HOW WAS THE DAY");
		m.addAttribute("myMessage3", "HAVE A NICE DAY");
		return "WELCOME";
	}

	@RequestMapping("/super")
	public ModelAndView ss(ModelAndView m) {
		m.addObject("food", "hello model and view");
		m.setViewName("canteen");
		return m;
	}

	@RequestMapping("/emp")
	public ModelAndView showform() {
		return new ModelAndView("emp", "command", new employee());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("empl") employee empl) {
		System.out.println(empl.getName() + " " + empl.getSalary() + " " + empl.getDesignation());
		return new ModelAndView("redirect:/view");
	}

	@RequestMapping("/view")
	public ModelAndView viewemp() {
		List<employee> list = new ArrayList<employee>();
		list.add(new employee("rahul", 35000.00, "S.Engineer"));
		list.add(new employee("aditya", 25000.0, "IT Manager"));
		list.add(new employee("sachin", 55000.0, "Care Taker"));

		return new ModelAndView("view", "list", list);
	}
}
