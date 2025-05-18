package com.formacionbdi.springboot.app.agencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "servicio-productos")
@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioAgenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioAgenciaApplication.class, args);
	}

}
