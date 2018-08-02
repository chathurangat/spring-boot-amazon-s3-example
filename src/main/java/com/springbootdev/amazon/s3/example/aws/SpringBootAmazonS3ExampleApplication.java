package com.springbootdev.amazon.s3.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringBootAmazonS3ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAmazonS3ExampleApplication.class, args);
    }
}
