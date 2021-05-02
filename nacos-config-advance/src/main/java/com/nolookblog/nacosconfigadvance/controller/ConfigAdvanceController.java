package com.nolookblog.nacosconfigadvance.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mrrrrr10
 * @github https://github.com/Mrrrrr10
 * @blog https://nolookblog.com/
 * @description
 */

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigAdvanceController {

	@Value("${grade}")
	private String grade;

	@Value("${class}")
	private String clazz;

	@GetMapping("/get")
	public String get() {
		return grade + clazz;
	}

}
