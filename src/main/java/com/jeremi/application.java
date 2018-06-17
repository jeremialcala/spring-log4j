package com.jeremi;

import com.jeremi.utils.tools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import java.io.PrintStream;

@SpringBootApplication
public class application {
    private static Logger log =  Logger.getLogger(application.class.getName());
    private static PrintStream out = System.out;

    public static void main(String[] args){
        MDC.put("sid", tools.getSessionId());
        log.info("Hello world");
        SpringApplication.run(application.class);
        log.info("Application Loaded...");
    }
}
