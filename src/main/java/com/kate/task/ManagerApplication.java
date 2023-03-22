package com.kate.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
//@PropertySource("classpath:application-h2.properties")
public class ManagerApplication {

 	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
	}

}
