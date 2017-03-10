package com.jeve.demo.a;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoAApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoAApplication.class).web(true).run(args);
	}

}
