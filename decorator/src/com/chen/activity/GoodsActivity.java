package com.chen.activity;

import java.math.BigDecimal;

/**
 * 商品获得接口
 *
 * @author chen
 * @create 2019-04-01 14:40
 **/
public interface GoodsActivity {

    /**
     * 获取应该支付的金额
     * @return
     */
    BigDecimal getPayPrice();

}
