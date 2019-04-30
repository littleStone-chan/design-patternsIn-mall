package com.chen.proxy;

/**
 * @author chen
 * @create 2019-04-24 18:12
 **/
public class CglibProxyMain {

    public static void main(String[] args) {
        Subject subject2 = new RealSubject();
        // 生成 Cglib 代理类
        Subject subject = (Subject) CglibProxy.getProxy(subject2);
        subject.sellBook();
    }

}
