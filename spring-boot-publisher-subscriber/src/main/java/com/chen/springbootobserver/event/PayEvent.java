package com.chen.springbootobserver.event;

import org.springframework.context.ApplicationEvent;

/**
 * @description:支付事件，有人支付了订单
 * @author: Chen
 * @create: 2019-04-21 10:26
 **/
public class PayEvent extends ApplicationEvent {

    public PayEvent(Object source) {
        super(source);
        System.out.println("MsgEvent:"+source.toString());
    }
}
