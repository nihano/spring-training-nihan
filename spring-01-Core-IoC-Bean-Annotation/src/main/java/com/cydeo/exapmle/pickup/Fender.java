package com.cydeo.exapmle.pickup;

public class Fender extends Pickup{


    public Fender(String type, String brand) {
        super(type, brand);
    }

    @Override
    public void makeNoise() {
        System.out.println("Fender is making noise");
    }
}
