package com.jeve.monitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/")
	public String index(){
		logger.info("service-demo1 : "+TestController.class+" : index : "+"hello index");
		return "hello index!";
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "hello world!";
	}
}
