package com.springboot.mysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SN")
public class SnacksController {
	@RequestMapping("/snacks")

	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/snacks/free")
	public String welcomefree() {
		return "won half plate mutton briyani";
		
	}

}
