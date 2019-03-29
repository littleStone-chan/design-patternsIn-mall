package com.chen.pay.impl;

import com.chen.pay.PaymentMethod;

/**
 * @description:微信支付
 * @author: Chen
 * @create: 2019-03-29 00:42
 **/
public class WechatPay implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
