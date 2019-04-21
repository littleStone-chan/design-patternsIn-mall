package com.chen.springbootobserver.listener;

import com.chen.springbootobserver.event.PayEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description:佣金监听器
 * @author: Chen
 * @create: 2019-04-21 23:50
 **/
@Component
public class CommissionListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof PayEvent){
            System.out.println("有人下单，开始分佣啦");
        }
        System.out.println("收到广播：CommissionListener");
    }
}
