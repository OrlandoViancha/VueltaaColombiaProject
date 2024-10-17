package com.uptc.frw.javaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.uptc.frw.javaproject.Repositorio.logs")
public class JavaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaProjectApplication.class, args);
    }

}
