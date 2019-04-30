package com.chen.springbootobserver.publisher;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @description:事件发布者
 * @author: Chen
 * @create: 2019-04-21 10:28
 **/
@Component
public class EventPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public void publishEvent(ApplicationEvent event){
        applicationContext.publishEvent(event);
    }
}
