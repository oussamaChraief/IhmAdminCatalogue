package com.orange.ihm.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages= {"com.orange.ihm.admin.domain"})
@EnableJpaRepositories(basePackages= {"com.orange.ihm.admin.persistance"})
@SpringBootApplication
public class IhmAdminCatalogueWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhmAdminCatalogueWebApplication.class, args);
	}
}
