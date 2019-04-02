package com.chen.springbootstrategy.strategy;

import com.chen.springbootstrategy.activity.GoodsActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

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
