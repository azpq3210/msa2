package com.gdt.msa.zuul_30001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul30001Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul30001Application.class, args);
    }
}
