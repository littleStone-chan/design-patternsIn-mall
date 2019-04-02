package com.chen.springbootstrategy.activity.impl;


import com.chen.springbootstrategy.activity.GoodsActivity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 满减活动
 *
 * @author chen
 * @create 2019-04-01 14:48
 **/
@Component
public class FullReduceActivity implements GoodsActivity {

    //满多少
    private BigDecimal fullAmount;

    //减多少
    private BigDecimal reductionAmount ;

    @Override
    public BigDecimal getPayPrice(BigDecimal amount) {

        //假装从数据库的配置表取配置数据
        fullAmount = new BigDecimal(300);

        reductionAmount  = new BigDecimal(100);

        return amount.compareTo(fullAmount)>=0?amount.subtract(reductionAmount):amount;
    }
}
