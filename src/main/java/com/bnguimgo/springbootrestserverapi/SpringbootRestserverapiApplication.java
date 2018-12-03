package com.bnguimgo.springbootrestserverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication remplace les annotations @Configuration, @EnableAutoConfiguration et @ComponentScan
 * 
 * Le package courant et sous-package seront scannés
 * 
 */
@SpringBootApplication
public class SpringbootRestserverapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestserverapiApplication.class, args);
	}
}
