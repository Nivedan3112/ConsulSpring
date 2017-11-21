package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {

	@RequestMapping("/details")
	public String getDetails() {

		return "History has a new Home";

	}

}
