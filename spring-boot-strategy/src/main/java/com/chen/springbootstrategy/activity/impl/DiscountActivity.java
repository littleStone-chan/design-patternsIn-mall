package com.chen.springbootstrategy.activity.impl;


import com.chen.springbootstrategy.activity.GoodsActivity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 商品折扣活动
 *
 * @author chen
 * @create 2019-04-01 14:44
 **/
@Component
public class DiscountActivity implements GoodsActivity {

    //折扣
    private double discount ;


    @Override
    public BigDecimal getPayPrice(BigDecimal amount) {

        //假装从数据库的配置表取折扣
        discount = 8.0;

        return new BigDecimal(discount).multiply(amount).divide(new BigDecimal(10));
    }
}
