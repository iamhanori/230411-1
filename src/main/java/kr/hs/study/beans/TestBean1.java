package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
    @Autowired
    private Car data1;

    @Autowired
    private Train data2;

    public Car getData1() { return data1; }
    public Train getData2() { return data2; }

}
