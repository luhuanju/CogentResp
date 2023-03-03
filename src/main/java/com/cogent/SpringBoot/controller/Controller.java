package com.cogent.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	// End Points URL for REST Apis.

	@GetMapping("/hello")
	public String helloString() {
		return "<h1 style=\"color: blue;\">Hunaju</h1>";
	}
}
