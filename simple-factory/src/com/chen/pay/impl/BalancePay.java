package com.chen.pay.impl;

import com.chen.pay.PaymentMethod;

/**
 * @description:余额支付
 * @author: Chen
 * @create: 2019-03-29 00:43
 **/
public class BalancePay implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("余额支付");
    }
}
