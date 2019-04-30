package com.chen.activity.decorator.activity;

import com.chen.activity.GoodsActivity;
import com.chen.activity.decorator.GoodsActivityDecorator;

import java.math.BigDecimal;

/**
 * 商品折扣活动 装饰类
 *
 * @author chen
 * @create 2019-04-30 17:47
 **/
public class DiscountActivityDecorator extends GoodsActivityDecorator {

    GoodsActivity goodsActivity;

    //折扣
    private Integer discount = 8;

    public DiscountActivityDecorator(GoodsActivity goodsActivity) {
        super(goodsActivity);
        this.goodsActivity = goodsActivity;
    }

    @Override
    public BigDecimal getPayPrice() {
        return goodsActivity.getPayPrice().multiply(new BigDecimal(discount*0.1));
    }

}
