package com.chen.activity.impl;

import com.chen.activity.GoodsActivity;

import java.math.BigDecimal;

/**
 * 积分抵扣
 *
 * @author chen
 * @create 2019-04-01 14:58
 **/
public class GoodsActivityImpl implements GoodsActivity {

    //商品原价
    private BigDecimal originalPrice;

    public GoodsActivityImpl(BigDecimal originalPrice){
        this.originalPrice = originalPrice;
    }

    @Override
    public BigDecimal getPayPrice() {
        return this.originalPrice;
    }
}
