package com.jitesh.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApplicationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplicationsApplication.class, args);
	}

}
