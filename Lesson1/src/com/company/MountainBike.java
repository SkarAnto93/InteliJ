package com.company;

public class MountainBike extends Bicycle {
    String ruberTires;

    public void setRuberTires(String ruberTires) {
        this.ruberTires = ruberTires;


    }

    public String getRuberTires() {
        System.out.println(ruberTires);
        return ruberTires;
    }
}
