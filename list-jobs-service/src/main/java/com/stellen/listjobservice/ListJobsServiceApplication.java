package com.stellen.listjobservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ListJobsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListJobsServiceApplication.class, args);
	}

}
