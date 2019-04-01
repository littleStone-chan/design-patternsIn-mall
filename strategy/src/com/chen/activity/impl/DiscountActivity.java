package com.chen.activity.impl;

import com.chen.activity.GoodsActivity;

import java.math.BigDecimal;

/**
 * 商品折扣活动
 *
 * @author chen
 * @create 2019-04-01 14:44
 **/
public class DiscountActivity implements GoodsActivity {

    //折扣
    private double discount;

    public DiscountActivity(double discount){
        this.discount = discount;
    }

    @Override
    public BigDecimal getPayPrice(BigDecimal amount) {
        return new BigDecimal(discount).multiply(amount).divide(new BigDecimal(10));
    }
}
