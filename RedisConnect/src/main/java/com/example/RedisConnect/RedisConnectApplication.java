package com.example.RedisConnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisConnectApplication {

	public static void main(String[] args) {


		try {
			SpringApplication.run(RedisConnectApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
