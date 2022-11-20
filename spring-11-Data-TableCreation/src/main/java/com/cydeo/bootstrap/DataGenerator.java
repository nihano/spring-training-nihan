package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Car c1 = new Car("BMW","M3");
        Car c2 = new Car("Honda","Civic");
        Car c3 = new Car("Toyota","Corolla");

        //save c1,c2,c3 to DB. do we have any method which is doing saving for me? inject that class to use save method. CarRepository

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

    }
}
