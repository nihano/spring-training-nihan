package com.cydeo.exapmle.String;

import lombok.Getter;

@Getter
public abstract class GuitarString {
    private String thickenss;
    private String brand;

    public GuitarString(String thickenss, String brand) {
        this.thickenss = thickenss;
        this.brand = brand;
    }

    public abstract void rhythm();
}
