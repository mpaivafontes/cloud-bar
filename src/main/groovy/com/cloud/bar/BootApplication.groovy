package com.cloud.bar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

import static org.springframework.boot.SpringApplication.run

@EnableDiscoveryClient
@SpringBootApplication
class BootApplication {

    static void main(String[] args) {
        run BootApplication, args
    }
}
