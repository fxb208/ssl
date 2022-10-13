package com.example.ssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootSSLApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSSLApplication.class, args);
	}

	@RequestMapping("/ssl")
	public String helloSSL() {
		return "hello ssl";
	}
}
