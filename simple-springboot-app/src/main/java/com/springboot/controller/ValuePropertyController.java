package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValuePropertyController {

	@Value("${configuration.property.value:default value}")
	private String springProperty;

	@GetMapping("/property")
	public String getPropertyFromConfiguration() {
		return String.format("Value obtained from application.yml file is -> %s", springProperty);
	}

	@RequestMapping("/property")
	public String getProp() {
		return String.format("Value obtained from application.yml and new method is -> %s", springProperty);
	}
}
