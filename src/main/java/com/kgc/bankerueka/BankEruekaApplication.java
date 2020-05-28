package com.kgc.bankerueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankEruekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankEruekaApplication.class, args);
    }

}
