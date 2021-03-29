package com.arvin.spring.recipapp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
//@Configuration
//@ComponentScan(basePackages  = { "com.arvin.spring.recipeapp.spring.recipeapp",
//	                        	  "com.arvin.spring.recipapp.spring.Controller",
//        "com.arvin.spring.recipapp.spring.Model",
//		"com.arvin.spring.recipapp.spring.repository"})
public class RecipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
	}

}
