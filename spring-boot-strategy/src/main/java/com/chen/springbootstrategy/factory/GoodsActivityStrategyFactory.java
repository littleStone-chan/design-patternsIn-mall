package com.chen.springbootstrategy.factory;

import com.chen.springbootstrategy.activity.GoodsActivity;
import com.chen.springbootstrategy.strategy.GoodsActivityContext;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 活动商品策略工厂
 *
 * @author chen
 * @create 2019-04-02 17:11
 **/
@Component
public class GoodsActivityStrategyFactory {

    @Autowired
    private Map<String,GoodsActivity> goodsActivityMap;

    /**
     * 根据活动类型 获取所对应的策略
     * @param activityType
     */
    public GoodsActivityContext getGoodsActivityStrategy(String activityType){

        GoodsActivityContext goodsActivityContext;

        switch (activityType){
            case "discount":
                goodsActivityContext = new GoodsActivityContext(goodsActivityMap.get("discountActivity"));
                break;
            case "fullReduce":
                goodsActivityContext = new GoodsActivityContext(goodsActivityMap.get("fullReduceActivity"));
                break;
            case "integral":
                goodsActivityContext = new GoodsActivityContext(goodsActivityMap.get("integralActivity"));
                break;
            default:
                goodsActivityContext = null;
        }

        return goodsActivityContext;
    }

}
