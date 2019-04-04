package com.chen;

import com.chen.observer.CommissionObserver;
import com.chen.observer.MsgObserver;
import com.chen.observer.OrderObserver;
import com.chen.watched.PayWatched;

/**
 * @description:当用户下单成功后，要执行 修改订单状态，分佣，通知店主发货
 * @author: Chen
 * @create: 2019-04-03 22:34
 **/
public class ObserverMain {

    public static void main(String[] args) {

        PayWatched payWatched = new PayWatched();

        new CommissionObserver(payWatched);
        new MsgObserver(payWatched);
        new OrderObserver(payWatched);

        payWatched.notifyObservers();
    }

}
