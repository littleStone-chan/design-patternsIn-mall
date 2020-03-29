package com.chen.activity;

import com.chen.activity.decorator.activity.DiscountActivityDecorator;
import com.chen.activity.decorator.activity.IntegralActivityDecorator;
import com.chen.activity.impl.GoodsActivityImpl;

import java.math.BigDecimal;

/**
 * @author chen
 * @create 2019-04-30 17:59
 **/
public class Main {

    public static void main(String[] args) {

        GoodsActivity goodsActivity = new GoodsActivityImpl(new BigDecimal(100));

        goodsActivity = new DiscountActivityDecorator(goodsActivity);
        goodsActivity = new IntegralActivityDecorator(goodsActivity);
        System.out.println(goodsActivity.getPayPrice());
    }

}
