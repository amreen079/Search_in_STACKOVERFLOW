package com.bayestree.assesment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bayestree.assesment.service.Stackservice;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class);
		Stackservice service = new Stackservice();
		service.res();
	}
}
