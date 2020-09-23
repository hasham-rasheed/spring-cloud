package com.handson.microservices.moviesinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoviesInfoApplication {

  public static void main(String[] args) {
    SpringApplication.run(MoviesInfoApplication.class, args);
  }
}
