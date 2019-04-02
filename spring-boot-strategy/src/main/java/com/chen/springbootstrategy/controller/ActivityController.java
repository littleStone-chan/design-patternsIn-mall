package com.chen.springbootstrategy.controller;

import com.chen.springbootstrategy.activity.GoodsActivity;
import com.chen.springbootstrategy.activity.impl.DiscountActivity;
import com.chen.springbootstrategy.activity.impl.FullReduceActivity;
import com.chen.springbootstrategy.activity.impl.IntegralActivity;
import com.chen.springbootstrategy.factory.GoodsActivityStrategyFactory;
import com.chen.springbootstrategy.strategy.GoodsActivityContext;
import com.chen.springbootstrategy.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 活动控制层
 *
 * @author chen
 * @create 2019-04-02 14:09
 **/
@RestController
public class ActivityController{

    @Autowired
    private DiscountActivity discountActivity;

    @Autowired
    private FullReduceActivity fullReduceActivity;

    @Autowired
    private IntegralActivity integralActivity;

    @Autowired
    private GoodsActivityStrategyFactory goodsActivityStrategyFactory;

    /**
     * 获取最终售价
     *  （这样的控制层写法很不友好，需要写大量的代码去实现）
     *      为了解决这个问题，将引用工厂模式...
     *
     *      工厂是创建型模式,它的作用就是创建对象；
     *      策略是行为型模式,它的作用是让一个对象在许多行为中选择一种行为;
     *
     *  解决不同的问题
     * 工厂模式是创建型的设计模式，它接受指令，创建出符合要求的实例；它主要解决的是资源的统一分发，将对象的创建完全独立出来，让对象的创建和具体的使用客户无关。主要应用在多数据库选择，类库文件加载等。
     * 策略模式是为了解决的是策略的切换与扩展，更简洁的说是定义策略族，分别封装起来，让他们之间可以相互替换，策略模式让策略的变化独立于使用策略的客户。
     *
     * 工厂相当于黑盒子，策略相当于白盒子；
     *
     *
     * @param activityType
     * @param amount
     * @return
     */
    @RequestMapping("getLastPrice")
    public ResponseResult getLastPrice(String activityType,BigDecimal amount){

        ResponseResult responseResult = ResponseResult.getInstance();

        GoodsActivityContext goodsActivityContext;

        //根据活动类型获取最终售价
        switch (activityType){
            case "discount":
                goodsActivityContext = new GoodsActivityContext(discountActivity);
                break;
            case "fullReduce":
                goodsActivityContext = new GoodsActivityContext(fullReduceActivity);
                break;
            case "integral":
                goodsActivityContext = new GoodsActivityContext(integralActivity);
                break;
            default:
                responseResult.setCode(1);
                responseResult.setMsg("数据类型错误");
                responseResult.setData(null);
                return responseResult;
        }

        responseResult.setCode(0);
        responseResult.setMsg("操作成功");
        responseResult.setData(goodsActivityContext.getPrice(amount));

        return responseResult;
    }


    @RequestMapping("getLastPrice_V2")
    public ResponseResult getLastPrice_V2(String activityType,BigDecimal amount){


        ResponseResult responseResult = ResponseResult.getInstance();
        //从工厂中获取  活动策略
        GoodsActivityContext goodsActivityContext = goodsActivityStrategyFactory.getGoodsActivityStrategy(activityType);

        if (goodsActivityContext==null){
            responseResult.setCode(1);
            responseResult.setData(null);
            responseResult.setMsg("数据类型错误");
            return responseResult;
        }

        responseResult.setCode(0);
        responseResult.setMsg("操作成功");
        responseResult.setData(goodsActivityContext.getPrice(amount));

        return responseResult;
    }

}
