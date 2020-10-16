package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * 
 * @author vinita
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class CaseStudyApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CaseStudyApplication.class, args);
	}


}
