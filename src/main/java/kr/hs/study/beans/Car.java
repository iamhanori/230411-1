package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class Car {
    String name;
    int fuelE;

    public Car(String name, int fuelE) {
        this.name = name;
        this.fuelE = fuelE;
    }

    public String getName() {
        return name;
    }

    public int getFuelE() {
        return fuelE;
    }

    public void pr() {
        System.out.println(name + " is Car");
    }

}
