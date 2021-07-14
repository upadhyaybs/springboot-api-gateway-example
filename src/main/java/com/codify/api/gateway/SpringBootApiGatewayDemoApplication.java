package com.codify.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SpringBootApiGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiGatewayDemoApplication.class, args);
	}

}
