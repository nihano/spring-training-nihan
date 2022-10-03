package com.cydeo.bean_annotation.monitorfactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter

public class SonyMonitor extends Monitor{

    public SonyMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
