package com.example.love.k8s;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tasks {

    String tick = "tick";

    @Scheduled(fixedRate = 1200)
    public void tick() {

        tick = tick.equals("tick") ? "tok" : "tick";


        System.out.println(tick);


    }
}

