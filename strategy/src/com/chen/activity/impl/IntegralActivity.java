package com.chen.activity.impl;

import com.chen.activity.GoodsActivity;

import java.math.BigDecimal;

/**
 * 积分抵扣
 *
 * @author chen
 * @create 2019-04-01 14:58
 **/
public class IntegralActivity implements GoodsActivity {

    //抵扣的积分  10积分=1元
    private int integral;

    public IntegralActivity(int integral){
        this.integral = integral;
    }

    @Override
    public BigDecimal getPayPrice(BigDecimal amount) {
        return amount.subtract(new BigDecimal(integral/10));
    }
}
