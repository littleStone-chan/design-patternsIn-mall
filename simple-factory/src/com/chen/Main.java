package com.chen;

import com.chen.factory.PayFactory;
import com.chen.pay.PaymentMethod;

/**
 * @description:入口
 * @author: Chen
 * @create: 2019-03-29 00:53
 **/
public class Main {

    public static void main(String[] args) {

        PayFactory payFactory = new PayFactory();

        PaymentMethod paymentMethod = payFactory.pay("alipay");

        paymentMethod.pay();

    }

}
