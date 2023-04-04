package com.hicode.backendkeycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;

@SpringBootApplication
public class BackendKeycloakApplication {

	public static void main(String[] args) {



		SpringApplication.run(BackendKeycloakApplication.class, args);
	}

}
