package com.chen.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @description:佣金观察者
 * @author: Chen
 * @create: 2019-04-03 22:55
 **/
public class CommissionObserver implements Observer {

    public CommissionObserver(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("大家注意了，有傻逼下单了，我要开始分佣金了");
    }
}
