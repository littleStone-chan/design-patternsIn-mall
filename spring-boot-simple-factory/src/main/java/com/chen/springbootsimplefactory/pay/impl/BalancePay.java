package com.chen.springbootsimplefactory.pay.impl;

import com.chen.springbootsimplefactory.pay.PaymentMethod;
import org.springframework.stereotype.Service;

/**
 * @description:余额支付
 * @author: Chen
 * @create: 2019-03-29 00:43
 **/
@Service
public class BalancePay implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("余额支付");
    }
}
