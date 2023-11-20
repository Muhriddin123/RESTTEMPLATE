package com.restTemplate.rest;


import com.restTemplate.rest.config.Config;
import com.restTemplate.rest.controller.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
@SpringBootApplication
@Import(Config.class)
public class ResttemplApplication implements CommandLineRunner {


    private final Controller controller;
    @Autowired
    public ResttemplApplication(Controller controller) {
        this.controller = controller;
    }

    public static void main(String[] args) {
        SpringApplication.run(ResttemplApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        controller.getAll();
        controller.create();
        controller.update();
        controller.delete(3);

    }
}