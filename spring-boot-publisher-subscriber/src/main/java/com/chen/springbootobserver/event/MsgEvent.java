package com.chen.springbootobserver.event;

import org.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: Chen
 * @create: 2019-04-21 10:26
 **/
public class MsgEvent extends ApplicationEvent {

    public MsgEvent(Object source) {
        super(source);
        System.out.println("MsgEvent:"+source.toString());
    }
}
