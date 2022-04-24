package com.zensar.advertize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.advertize.entity.Categories;

@SpringBootApplication
public class OlxAdvertizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxAdvertizeApplication.class, args);
		Categories data=new Categories();
	
	}
}
