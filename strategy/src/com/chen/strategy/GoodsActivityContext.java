package com.chen.strategy;

import com.chen.activity.GoodsActivity;

import java.math.BigDecimal;

/**
 * Context上下文，对strategy对象的引用
 *
 * @author chen
 * @create 2019-04-01 15:07
 **/
public class GoodsActivityContext {

    private GoodsActivity goodsActivity;

    public GoodsActivityContext(GoodsActivity goodsActivity){
        this.goodsActivity=goodsActivity;
    }

    /**
     * 获取商品价格
     * @param amount
     * @return
     */
    public BigDecimal getPrice(BigDecimal amount){
        return goodsActivity.getPayPrice(amount);
    }
}
