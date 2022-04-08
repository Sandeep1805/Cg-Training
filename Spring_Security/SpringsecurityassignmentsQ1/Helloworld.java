package com.springsecurity.SpringsecurityassignmentsQ1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@GetMapping("/admin")
	public String admin() {
		return "Hello World!";
	}
}
