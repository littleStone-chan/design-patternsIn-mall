package com.chen.springbootsimplefactory.factory;

import com.chen.springbootsimplefactory.pay.PaymentMethod;
import com.chen.springbootsimplefactory.pay.impl.Alipay;
import com.chen.springbootsimplefactory.pay.impl.BalancePay;
import com.chen.springbootsimplefactory.pay.impl.WechatPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description:支付工厂
 * @author: Chen
 * @create: 2019-03-29 00:46
 **/
@Service
public class PayFactory {

    @Autowired
    private Alipay alipay;
    @Autowired
    private BalancePay balancePay;
    @Autowired
    private WechatPay wechatPay;

    @Autowired
    private Map<String,PaymentMethod> paymentMethodMap;

    public PaymentMethod pay(String payType){

        //写法一
//        switch (payType){
//
//            case "balancePay":
//                return balancePay;
//            case "alipay":
//                return alipay;
//            case "wechatPay":
//                return wechatPay;
//
//            default:
//                System.out.println("支付方式错误");
//        }

        //写法二
        return paymentMethodMap.get(payType);
    }

}
