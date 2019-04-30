package com.chen;

import com.chen.activity.GoodsActivity;
import com.chen.activity.impl.DiscountActivity;
import com.chen.activity.impl.FullReduceActivity;
import com.chen.activity.impl.IntegralActivity;
import com.chen.strategy.GoodsActivityContext;

import java.math.BigDecimal;

/**
 * 策略模式测试入口
 *
 * @author chen
 * @create 2019-04-01 14:29
 **/
public class StrategyMain {

    /**
     *
     * 在商城系统中，经常有不同的活动，每种活动商品的价格计算可能都不一样
     * 比如：会员折扣，满减，积分抵扣.....
     * 前提：每次购买只能选择一种优惠活动
     *
     * @param args
     */
    public static void main(String[] args) {

        //商品价格
        BigDecimal amount = new BigDecimal(500);

        //满300-100
        GoodsActivity fullReduceActivity = new FullReduceActivity(new BigDecimal(300),new BigDecimal(100) );
        GoodsActivityContext goodsActivityContext = new GoodsActivityContext(fullReduceActivity);
        System.out.println("满减活动："+goodsActivityContext.getPrice(amount));

        //折扣活动
        GoodsActivity discountActivity = new DiscountActivity(9);
        goodsActivityContext = new GoodsActivityContext(discountActivity);
        System.out.println("折扣活动："+goodsActivityContext.getPrice(amount));

        //积分抵扣活动
        GoodsActivity integralActivity = new IntegralActivity(100);
        goodsActivityContext = new GoodsActivityContext(integralActivity);
        System.out.println("积分抵扣活动："+goodsActivityContext.getPrice(amount));

    }

}
