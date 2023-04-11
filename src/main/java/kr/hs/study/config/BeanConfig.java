package kr.hs.study.config;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.Train;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ 붙은 애들은 객체 만들어!!!!
@ComponentScan(basePackages = "kr.hs.study.beans")

public class BeanConfig {

    @Bean
    public Car rrr() {
        return new Car("c", 404);

    }

    @Bean
    public Train nnn() {
        return new Train("t", 40404, 555);
    }
}

