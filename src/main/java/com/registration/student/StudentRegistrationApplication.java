package com.registration.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration
@PropertySource({"classpath:mysql.properties"})
@ComponentScan({"com.registration.student"})
public class StudentRegistrationApplication {

	  public static void main(String[] args) {
		    SpringApplication.run(StudentRegistrationApplication.class, args);
		  }
	  
}
