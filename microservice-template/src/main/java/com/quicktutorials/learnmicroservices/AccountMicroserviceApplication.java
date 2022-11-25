package com.quicktutorials.learnmicroservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountMicroserviceApplication {

    private static final Logger log = LoggerFactory.getLogger(AccountMicroserviceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountMicroserviceApplication.class, args);
    }

}
