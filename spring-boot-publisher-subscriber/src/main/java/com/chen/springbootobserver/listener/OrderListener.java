package com.chen.springbootobserver.listener;

import com.chen.springbootobserver.event.PayEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description: 订单监听器
 * @author: Chen
 * @create: 2019-04-21 23:48
 **/
@Component
public class OrderListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof PayEvent){
            System.out.println("把订单状态改成已支付");
        }
        System.out.println("收到广播：OrderListener");
    }
}
