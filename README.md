## 在商城系统中设计模式的使用

1、单例模式  
场景：在返回消息给客户端的时候，我们会统一返回的格式
   * 饿汉式：[使用饿汉式编写返回格式](https://www.cnblogs.com/boychen/p/10624816.html)  

2、简单工厂模式:  
场景：支付方式分为微信支付、支付宝支付、余额支付。  
   * 基础篇：[使用简单工厂支付](https://www.cnblogs.com/boychen/p/10618868.html)
   * 进阶篇：[在springboot中使用简单工厂模式](https://www.cnblogs.com/boychen/p/10624935.html)

3、策略模式  
场景：商城活动中有几种，满减，打折，送积分....
   * 基础篇：[简单的使用策略模式](https://www.cnblogs.com/boychen/p/10714192.html)
   * 进阶篇：[在springboot中使用策略模式](https://www.cnblogs.com/boychen/p/10721078.html)
   
4、观察者模式和发布/订阅范式
场景：当用户下单成功后，要执行 修改订单状态，分佣，通知店主发货
   * 观察者模式：[java中的观察者模式](https://www.cnblogs.com/boychen/p/10747791.html)
   * 发布/订阅范式：[springboot中使用发布/订阅范式](https://www.cnblogs.com/boychen/p/10747791.html)