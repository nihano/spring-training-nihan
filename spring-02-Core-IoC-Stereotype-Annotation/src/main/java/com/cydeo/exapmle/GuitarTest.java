package com.cydeo.exapmle;

import com.cydeo.exapmle.String.GuitarString;
import com.cydeo.exapmle.exapmleConfig.ExampleConfig;
import com.cydeo.exapmle.pickup.Pickup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GuitarTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfig.class);
//        GuitarString guitarString = context.getBean("ernieBall", GuitarString.class);
        Pickup pickup = context.getBean("fender", Pickup.class);
        GuitarString guitarString = context.getBean(GuitarString.class);

        Guitar guitar = new Guitar(pickup, guitarString);
        System.out.println(guitar.getPickup().getBrand());
        System.out.println(guitarString.getBrand());
    }
}
