package com.chen.activity.decorator.activity;

import com.chen.activity.GoodsActivity;
import com.chen.activity.decorator.GoodsActivityDecorator;

import java.math.BigDecimal;

/**
 * 积分抵扣
 *
 * @author chen
 * @create 2019-04-30 17:54
 **/
public class IntegralActivityDecorator extends GoodsActivityDecorator {

    GoodsActivity goodsActivity ;

    //扣除积分
    private Integer integral = 10;

    public IntegralActivityDecorator(GoodsActivity goodsActivity) {
        super(goodsActivity);
        this.goodsActivity=goodsActivity;
    }

    @Override
    public BigDecimal getPayPrice() {
        return goodsActivity.getPayPrice().subtract(new BigDecimal(integral));
    }
}
