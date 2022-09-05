package com.xwnb.payment9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 必须是大哥~~
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9001Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment9001Application.class, args);
    }

}
