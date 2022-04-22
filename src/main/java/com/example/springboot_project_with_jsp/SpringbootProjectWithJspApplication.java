package com.example.springboot_project_with_jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.example.springboot_project_with_jsp")
public class SpringbootProjectWithJspApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootProjectWithJspApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProjectWithJspApplication.class, args);
    }

}
