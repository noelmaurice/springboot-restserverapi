package com.bnguimgo.springbootrestserverapi;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * Remplace l'ancien fichier web.xml qui n'est plus utilisé grace à Spring boot
 * 
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootRestserverapiApplication.class);
	}

}
