package com.example.sharehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.dao")
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
