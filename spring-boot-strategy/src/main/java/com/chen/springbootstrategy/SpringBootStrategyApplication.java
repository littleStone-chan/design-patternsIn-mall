package com.chen.springbootstrategy;

import com.chen.springbootstrategy.activity.impl.DiscountActivity;
import com.chen.springbootstrategy.strategy.GoodsActivityContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringBootStrategyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStrategyApplication.class, args);

        /**
         * 因为bean是在项目启动的时候就加载了
         * 所以在是从bean工厂中获取，但是这样就无法传入构造
         */
        DiscountActivity discountActivity = context.getBean(DiscountActivity.class);

        GoodsActivityContext goodsActivityContext = new GoodsActivityContext(discountActivity);
        System.out.println("折扣后的价格"+goodsActivityContext.getPrice(new BigDecimal(100)));

    }

}
