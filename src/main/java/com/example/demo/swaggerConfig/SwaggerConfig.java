package com.example.demo.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	/**
	 * 
	 * @return
	 */
	@Bean
	public Docket api() {
		// @formatter:off
		return new Docket(DocumentationType.SWAGGER_2).select()
				// .apis(RequestHandlerSelectors.any())
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))

				.build();
		// @formatter:on
	}
	 private ApiInfo metaInfo() {

	        ApiInfo apiInfo = new ApiInfo(
	                "Real Estate Property Management Spring Boot Swagger API",
	                "Spring Boot Swagger Example API ",
	                "1.0",
	                "Terms of Service",
	                new Contact("Tech", "url",
	                        "tech@gmail.com"),
	                "Apache License Version 2.0",
	                "https://www.apache.org/licesen.html"
	        );

	        return apiInfo;
	    }
}
