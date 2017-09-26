package com.thinkings.hello;

import com.thinkings.config.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.thinkings.*")
public class HelloApplication {

    @Autowired
    public  CustomProperties customProperties;
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
//        testConfig();
	}

//	public static void testConfig(){
//        System.out.println("customProperties ----properties.attritbuteA----"
//                + customProperties.getAttribute());
//    }
}
