package kr.hs.study;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 car = ctx.getBean("rrr" , TestBean1.class);
        System.out.println(car.getData1().getName());
        System.out.println(car.getData1().getFuelE());
        car.getData1().pr();

        TestBean1 train = ctx.getBean("nnn", TestBean1.class);
        System.out.println(train.getData2().getName());
        System.out.println(train.getData2().getKm());
        System.out.println(train.getData2().getPower());
        train.getData2().pr1();
        train.getData2().pr2();

        ctx.close();

    }
}