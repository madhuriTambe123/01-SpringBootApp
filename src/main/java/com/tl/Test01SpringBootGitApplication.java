package com.tl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.classic.joran.action.ConfigurationAction;

@SpringBootApplication
public class Test01SpringBootGitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Test01SpringBootGitApplication.class, args);
		ctx.close();
		// Commeted code
		
		//changes for Bug 102
	}

}
