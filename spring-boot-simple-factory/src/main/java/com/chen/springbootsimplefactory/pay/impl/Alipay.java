package com.chen.springbootsimplefactory.pay.impl;

import com.chen.springbootsimplefactory.pay.PaymentMethod;
import org.springframework.stereotype.Service;

/**
 * @description: 支付宝支付
 * @author: Chen
 * @create: 2019-03-29 00:41
 **/
@Service
public class Alipay implements PaymentMethod {
    
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
