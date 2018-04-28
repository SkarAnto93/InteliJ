package com.company;

public class Bicycle {

    int cadence = 0;
    int gear = 1;
    int speed = 0;
    String bikeName;

    void changeGear(int value){
        gear = value;

    }

    void changeCadence (int value){
        cadence = value;

    }

    void changeSpeed (int value) {
        speed = speed + value;

    }

    void applyBreaks (int value) {
        speed = speed - value;

    }

    void getStates (){
        System.out.println("gear: " + gear + " cadence: " + cadence + " speed: " + speed);
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikeName() {
        System.out.println(bikeName);
        return bikeName;

    }
}
