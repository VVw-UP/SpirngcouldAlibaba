package com.xwnb.payment9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author vvw
 * @date 2022/8/21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9002 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9002.class,args);
    }
}
