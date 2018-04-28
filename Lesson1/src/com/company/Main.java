package com.company;

public class Main {

    public static void main(String[] args) {
	Bicycle bike1 = new Bicycle();
	Bicycle bike2 = new Bicycle ();
	MountainBike bike3 = new MountainBike();

	    bike1.setBikeName("Fofi");
	    bike1.getBikeName();
	    bike1.changeGear(7);
	    bike1.changeCadence(2);
	    bike1.changeSpeed(100);
	    bike1.applyBreaks(20);
	    bike1.getStates();

	    bike2.setBikeName("Gennhmata");
	    bike2.getBikeName();
        bike2.changeGear(8);
        bike2.changeCadence(3);
        bike2.changeSpeed(120);
        bike2.applyBreaks(30);
        bike2.getStates();

        bike3.setRuberTires("Googyear");
        bike3.getRuberTires();
        bike3.setBikeName("Valar Morghulis");
        bike3.getBikeName();
        bike3.changeGear(9);
        bike3.changeCadence(3);
        bike3.changeSpeed(150);
        bike3.applyBreaks(30);
        bike3.getStates();

    }
}
