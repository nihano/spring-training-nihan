package com.cydeo.exapmle.String;

public class ErnieBall extends GuitarString{
    public ErnieBall(String thickenss, String brand) {
        super(thickenss, brand);
    }

    @Override
    public void rhythm() {
        System.out.println("ErnieBall plays the rhythm");
    }
}
