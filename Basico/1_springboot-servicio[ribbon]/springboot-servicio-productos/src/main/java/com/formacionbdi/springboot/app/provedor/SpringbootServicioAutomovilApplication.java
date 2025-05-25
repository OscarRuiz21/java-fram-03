package com.formacionbdi.springboot.app.provedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient 
public class SpringbootServicioAutomovilApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioAutomovilApplication.class, args);
	}

}
