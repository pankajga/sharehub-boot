package com.example.sharehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
		basePackages = {
				"com.example.*",
		})
public class SharehubApplication {

	public static void main(String[] args) {
		System.out.println("***************************************in starter***************************************");
		SpringApplication.run(SharehubApplication.class, args);
	}

}
