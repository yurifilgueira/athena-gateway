package com.projectathena.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AthenaGatewayApplication {
    static void main(String[] args) {
        SpringApplication.run(AthenaGatewayApplication.class, args);
    }
}
