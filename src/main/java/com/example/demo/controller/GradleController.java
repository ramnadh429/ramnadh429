package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class GradleController {
	@GetMapping("/wish")
	public String wishing() {
		return "Best of luck";
	}

}
