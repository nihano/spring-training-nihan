package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // we added this in interface because Spring Boot is creating implementation class in the run time
//after one version update we do not need to add this annotation anymore. @Repository implementing @Component like @Controller and @Service
//@Component is used to mark a class from which a will be created
//CarRepository has all the methods which come from JpaRepository
//We can also create our own method but this is interface where is the implementation? --> we will learn Queries for that.
public interface CarRepository extends JpaRepository<Car, Long> {


}
