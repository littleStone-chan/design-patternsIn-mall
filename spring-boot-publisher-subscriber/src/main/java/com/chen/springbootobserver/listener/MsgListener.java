package com.chen.springbootobserver.listener;


import com.chen.springbootobserver.event.PayEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description:信息监听器
 * @author: Chen
 * @create: 2019-04-21 09:57
 **/
@Component
public class MsgListener  implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof PayEvent){
            System.out.println("通知管理员，有人下单了");
        }
        System.out.println("收到广播：MsgListener");
    }
}
