package com.microservice.practice.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({})
@EnableJpaRepositories("com.microservice.practice.loans.repository")
@EntityScan("com.microservice.practice.loans.model")
public class MicroservicesLoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesLoansApplication.class, args);
    }

}
