package com.qsp.springboot_employee_management_system.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//This class is For Swagger Documentation

//@Configuration
@EnableSwagger2
public class ApplicationConfig {

	@Bean
	public Docket getDocket() {
		Contact contact = new Contact("EMPLOYEE_MANAGEMENT_SYSTEM","www.QSpiders.com", "kishancmusale143@gmail.com");
		List<VendorExtension> extensions = new ArrayList<VendorExtension>();
		
//		URL FOR SWAGGER
//		(http://localhost:8080/swagger-ui.html#)
		ApiInfo apiInfo = new ApiInfo("Employee_Management_System", "This App is Used To Manage the Employees", 
				"Version 1.0", "www.Emp_Mgmt_Sys.com", contact, "QSP001", "www.QSP001.com", extensions);
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.qsp.springboot_employee_management_system")).build().apiInfo(apiInfo).useDefaultResponseMessages(false);
	}
}
