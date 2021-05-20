package com.example.love.k8s;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyAbstractClassEnabler extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {

        builder.status(Status.UP).withDetail("status ", "still loading ").withDetail("start time", "now ");
    }
}
