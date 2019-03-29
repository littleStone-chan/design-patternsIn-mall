package com.chen.factory;

import com.chen.pay.PaymentMethod;
import com.chen.pay.impl.Alipay;
import com.chen.pay.impl.BalancePay;
import com.chen.pay.impl.WechatPay;

/**
 * @description:支付工厂
 * @author: Chen
 * @create: 2019-03-29 00:46
 **/
public class PayFactory {

    public PaymentMethod getPayment(String payType){

        switch (payType){

            case "alipay":
                return new Alipay();
            case "wechatPay":
                return new WechatPay();
            case "balancePay":
                return new BalancePay();

            default:
                System.out.println("支付方式错误");

        }
        return null;

    }

}
