package com.chen.springbootsimplefactory.controller;

import com.chen.springbootsimplefactory.factory.PayFactory;
import com.chen.springbootsimplefactory.pay.PaymentMethod;
import com.chen.springbootsimplefactory.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 支付控制层
 *
 * @author chen
 * @create 2019-03-29 10:43
 **/
@RestController
public class PayController {

    @Autowired
    private PayFactory payFactory;

    @RequestMapping("pay")
    public ResponseResult pay(String payType){

        ResponseResult responseResult = ResponseResult.getInstance();

        try {
            PaymentMethod paymentMethod = payFactory.pay(payType);
            paymentMethod.pay();
            responseResult.setMsg("操作成功");
            responseResult.setCode(0);
        }catch (Exception e){
            e.printStackTrace();
            responseResult.setMsg("支付类型错误");
            responseResult.setCode(1);
        }

        return responseResult;
    }

}
