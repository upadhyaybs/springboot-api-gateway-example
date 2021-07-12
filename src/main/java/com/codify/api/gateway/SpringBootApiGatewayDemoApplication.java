package com.codify.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy
@EnableEurekaClient
//@EnableHystrix
@SpringBootApplication
public class SpringBootApiGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiGatewayDemoApplication.class, args);
	}

}
