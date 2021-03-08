package com.nejdetkadirbektas.springvuemongocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringVueMongoCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringVueMongoCrudApplication.class, args);
    }

}
