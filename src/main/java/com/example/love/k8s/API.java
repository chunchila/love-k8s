package com.example.love.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
public class API {

    @GetMapping("/")
    public String getRoman() throws InterruptedException {

        Thread.sleep(Duration.ofSeconds(3).toMillis());

        return "roman\n";
    }

    @GetMapping("/1")
    public String getGlobal() throws InterruptedException {


        return "1\n";
    }
    @GetMapping("/2")
    public String getGlobalTwo() throws InterruptedException {


        return "2\n";
    }

    @GetMapping("/3")
    public String getGlobalThree() throws InterruptedException {


        return "3\n";
    }



}
