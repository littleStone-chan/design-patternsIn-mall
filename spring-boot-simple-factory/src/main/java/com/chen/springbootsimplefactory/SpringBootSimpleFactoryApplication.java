package com.chen.springbootsimplefactory;

import com.chen.springbootsimplefactory.pay.PaymentMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSimpleFactoryApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootSimpleFactoryApplication.class, args);
//        String[] beans = context.getBeanDefinitionNames();
//        for (String bean:beans) {
//            System.out.println("bean:"+bean);
//        }
        //然而在实际开发中，是不可能经常通过context获取bean的
        PaymentMethod paymentMethod = (PaymentMethod) context.getBean("alipay");
        paymentMethod.pay();
    }

}
