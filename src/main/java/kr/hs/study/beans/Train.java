package kr.hs.study.beans;


import org.springframework.beans.factory.annotation.Value;

public class Train {
    String name;
    int km;
    int power;

    public Train(String name, int km, int power) {
        this.name = name;
        this.km = km;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getKm() {
        return km;
    }

    public int getPower() {
        return power;
    }

    public void pr1() {
        System.out.println(name + " is Train");
    }

    public void pr2() {
        System.out.println("power " + power);
    }

}
