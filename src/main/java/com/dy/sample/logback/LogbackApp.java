package com.dy.sample.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackApp {
    private static final Logger LOG = LoggerFactory.getLogger(LogbackApp.class);

    public LogbackApp() {
        LOG.warn("start");
        for (int i = 0; i < 1000; i++) {
            LOG.info("abc: {}", i);
        }
        LOG.error("end");
    }

    public static void main(String[] args) {
        SpringApplication.run(LogbackApp.class, args);
    }
}
