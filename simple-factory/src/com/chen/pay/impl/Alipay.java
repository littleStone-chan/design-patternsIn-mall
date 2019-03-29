package com.chen.pay.impl;

import com.chen.pay.PaymentMethod;

/**
 * @description: 支付宝支付
 * @author: Chen
 * @create: 2019-03-29 00:41
 **/
public class Alipay implements PaymentMethod {
    
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
