package com.chen.activity.decorator;

import com.chen.activity.GoodsActivity;

import java.math.BigDecimal;

/**
 * 商品获得装饰类
 *
 * @author chen
 * @create 2019-04-30 17:11
 **/
public abstract class GoodsActivityDecorator implements GoodsActivity {

    GoodsActivity goodsActivity;

    public GoodsActivityDecorator(GoodsActivity goodsActivity){
        this.goodsActivity = goodsActivity;
    }

    @Override
    public BigDecimal getPayPrice() {
        return goodsActivity.getPayPrice();
    }
}
