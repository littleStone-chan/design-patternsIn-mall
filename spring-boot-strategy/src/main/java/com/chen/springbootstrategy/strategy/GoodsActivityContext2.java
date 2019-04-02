package com.chen.springbootstrategy.strategy;

import com.chen.springbootstrategy.activity.GoodsActivity;

import java.math.BigDecimal;

/**
 * 为了解决，控制层复杂的调用逻辑
 *  商品活动context
 * @author chen
 * @create 2019-04-02 17:12
 **/
public class GoodsActivityContext2 {

    private GoodsActivity goodsActivity;

    public GoodsActivity getGoodsActivity() {
        return goodsActivity;
    }

    public void setGoodsActivity(GoodsActivity goodsActivity) {
        this.goodsActivity = goodsActivity;
    }

    /**
     * 获取最后的支付价格
     * @param amount
     * @return
     */
    BigDecimal getLastPrice(BigDecimal amount){
        return goodsActivity.getPayPrice(amount);
    }

}
