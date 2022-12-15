package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Display all employees with email address ""
    List<Employee> findByEmail(String email);

    //Display all employees with firstName "", lastName""
    //also show all employees with email address ""
    //firstName and lastName needs to match also bring the email address

    List<Employee> findByFirstNameAndAndLastNameOrEmail(String firstname, String lastname, String email);


    //Display all employees that firstName is not ....
    List<Employee> findByFirstNameIsNot(String firstname);

    //display all employees where lastName starts with ......
    List<Employee> findByLastNameIsStartingWith(String pattern);

    //display all employees with salaries higher than  ...
    List<Employee> findBySalaryIsGreaterThan(Integer salary);

    //display all employees with salaries less than  ...
    List<Employee> findBySalaryIsLessThan(Integer salary);

    //Display all employees that has been hired between ... and ...
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salary is greater and equal to ... in order-salary
    List<Employee> findBySalaryIsGreaterThanEqualOrOrderBySalary(Integer salary);

    //display top unique 3 employees that is making less than ...
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();


}
