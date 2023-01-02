package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication()
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("1");

        SpringApplication.run(DemoApplication.class, args);
        System.out.println("4");
    }

    @Component
    @Order(1)
    class A implements CommandLineRunner{

        @Override
        public void run(String... args) throws Exception {
            System.out.println("2");
        }
    }
    @Component
    @Order(2)
    class B implements CommandLineRunner{

        @Override
        public void run(String... args) throws Exception {
            System.out.println("3");
        }
    }
}
