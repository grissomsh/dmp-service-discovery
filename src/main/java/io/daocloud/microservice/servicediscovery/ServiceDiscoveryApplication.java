package io.daocloud.microservice.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.spring4all.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableEurekaServer
@EnableSwagger2Doc
public class ServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryApplication.class, args);
	}
}
