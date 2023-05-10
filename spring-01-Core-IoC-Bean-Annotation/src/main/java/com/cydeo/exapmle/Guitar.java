package com.cydeo.exapmle;

import com.cydeo.exapmle.String.GuitarString;
import com.cydeo.exapmle.pickup.Pickup;
import lombok.Getter;

@Getter
public class Guitar {
    private Pickup pickup;
    private GuitarString guitarString;

    public Guitar(Pickup pickup, GuitarString guitarString) {
        this.pickup = pickup;
        this.guitarString = guitarString;
    }

    private void rock(){
        pickup.makeNoise();
        guitarString.rhythm();
    }
}
