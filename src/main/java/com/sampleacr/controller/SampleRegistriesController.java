package com.sampleacr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRegistriesController {

	@GetMapping("/test")
	public String test() {
		System.out.println("Hello I am naveen");
		return "I am naveen";
	}
}
