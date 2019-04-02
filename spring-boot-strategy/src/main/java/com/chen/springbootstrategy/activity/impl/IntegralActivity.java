package com.chen.springbootstrategy.activity.impl;


import com.chen.springbootstrategy.activity.GoodsActivity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 积分抵扣
 *
 * @author chen
 * @create 2019-04-01 14:58
 **/
@Component
public class IntegralActivity implements GoodsActivity {

    //抵扣的积分  10积分=1元
    private int integral = 100;

    @Override
    public BigDecimal getPayPrice(BigDecimal amount) {
        return amount.subtract(new BigDecimal(integral/10));
    }
}
