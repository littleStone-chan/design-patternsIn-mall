package com.chen.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @description:订单观察者
 * @author: Chen
 * @create: 2019-04-03 22:49
 **/
public class OrderObserver implements Observer {

    public OrderObserver(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("赶紧把订单改成已支付");
    }
}
