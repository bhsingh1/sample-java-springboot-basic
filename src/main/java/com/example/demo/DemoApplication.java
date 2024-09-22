package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        return "Hello! Hope you are doing well. This is a sample application running on OpenShift 4.16! We thank you for your time to let us present this demo. Wishing you a great day!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
