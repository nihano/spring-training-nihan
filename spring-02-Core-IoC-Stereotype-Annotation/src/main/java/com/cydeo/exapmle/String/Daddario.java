package com.cydeo.exapmle.String;

public class Daddario extends GuitarString {
    public Daddario(String thickenss, String brand) {
        super(thickenss, brand);
    }

    @Override
    public void rhythm() {
        System.out.println("Daddario plays the rhythm");
    }
}
