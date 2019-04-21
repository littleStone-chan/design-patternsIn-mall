package com.chen;

import com.chen.observable.PayObservable;
import com.chen.observer.CommissionObserver;
import com.chen.observer.MsgObserver;
import com.chen.observer.OrderObserver;

/**
 * @description:当用户下单成功后，要执行 修改订单状态，分佣，通知店主发货
 * @author: Chen
 * @create: 2019-04-03 22:34
 **/
public class ObserverMain {

    public static void main(String[] args) {

        PayObservable payObservable = new PayObservable();

        new CommissionObserver(payObservable);
        new MsgObserver(payObservable);
        new OrderObserver(payObservable);

        payObservable.notifyObservers();
    }
}
