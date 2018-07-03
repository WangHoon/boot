package com.wx.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//// @SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan({"com.wx.conf","com.wx.controller"})
public class AppStart {
	
	public static void main(String[] args) {
		SpringApplication.run(AppStart.class, args);
	}

}
