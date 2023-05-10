package com.cydeo.exapmle.pickup;

import lombok.Getter;

@Getter
public abstract class Pickup {
    private String type;
    private String brand;

    public Pickup(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public abstract void makeNoise();
}
