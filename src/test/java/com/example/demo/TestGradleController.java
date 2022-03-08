package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.controller.GradleController;

public class TestGradleController {
	@Test
	void test() {
		GradleController gc=new GradleController();
		String ms=gc.wishing();
		assertEquals("Best of luck",ms);
	}

}
