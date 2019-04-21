package com.chen.springbootobserver.controller;

import com.chen.springbootobserver.event.PayEvent;
import com.chen.springbootobserver.publisher.PayPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Chen
 * @create: 2019-04-21 23:55
 **/
@RestController
public class TestController {

    @Autowired
    private PayPublisher payPublisher;


    @RequestMapping("pay")
    public String pay(){
        PayEvent payEvent = new PayEvent("订单支付成功。");
        payPublisher.publishEvent(payEvent);
        return "success";
    }

}
