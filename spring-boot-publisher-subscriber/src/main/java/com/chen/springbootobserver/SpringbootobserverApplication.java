package com.chen.springbootobserver;

import com.chen.springbootobserver.event.PayEvent;
import com.chen.springbootobserver.publisher.PayPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootobserverApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringbootobserverApplication.class, args);
//        PayPublisher payPublisher = context.getBean("payPublisher",PayPublisher.class);
//        payPublisher.publishEvent(new PayEvent("1"));
    }


}
