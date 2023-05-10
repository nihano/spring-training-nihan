package com.cydeo.exapmle.pickup;

public class SeymourDuncan extends Pickup {


    public SeymourDuncan(String type, String brand) {
        super(type, brand);
    }

    @Override
    public void makeNoise() {
        System.out.println("Seymour Duncan is making noise");
    }
}
