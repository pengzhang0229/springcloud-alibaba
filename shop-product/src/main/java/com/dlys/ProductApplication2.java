package com.dlys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProductApplication.
 *
 * @author admin
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication2.class, args);
    }

}
