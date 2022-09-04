package com.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementApplication {


	public static void main(String[] args) {

		callCheck();

		SpringApplication.run(UserManagementApplication.class, args);
	}

	public static void callCheck(){
		System.out.println("CAlling");
	}
}
