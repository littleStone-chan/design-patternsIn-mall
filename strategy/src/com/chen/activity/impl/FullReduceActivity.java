package com.chen.activity.impl;

import com.chen.activity.GoodsActivity;

import java.math.BigDecimal;

/**
 * 满减活动
 *
 * @author chen
 * @create 2019-04-01 14:48
 **/
public class FullReduceActivity implements GoodsActivity {

    //满多少
    private BigDecimal fullAmount;

    //减多少
    private BigDecimal reductionAmount;

    public FullReduceActivity(BigDecimal fullAmount,BigDecimal reductionAmount){
        this.fullAmount=fullAmount;
        this.reductionAmount=reductionAmount;
    }

    @Override
    public BigDecimal getPayPrice(BigDecimal amount) {
        return amount.compareTo(fullAmount)>=0?amount.subtract(reductionAmount):amount;
    }
}
