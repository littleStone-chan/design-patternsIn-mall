package com.chen.springbootsimplefactory.pay.impl;

import com.chen.springbootsimplefactory.pay.PaymentMethod;
import org.springframework.stereotype.Service;

/**
 * @description:微信支付
 * @author: Chen
 * @create: 2019-03-29 00:42
 **/
@Service
public class WechatPay implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
