package com.nolookblog.stock.controller;

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
@RequestMapping("/stock")
@RefreshScope
public class StockController {

	@Value("${redis.url}")
	private String redisUrl;

	@Value("${mybatis-plus.mapper-locations}")
	private String locations;

	@GetMapping("/mybatis-plus")
	public String mybatisplus() {
		return locations;
	}

	@GetMapping("/redis")
	public String redis() {
		return redisUrl;
	}

}
