package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalary(Integer salary);

    //display top unique 3 employees that is making less than ...
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email='amcnee1@google.es'") //e obj,  Employee entity/class not the table name
    Employee retrieveEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email='amcnee1@google.es'")
    Integer retrieveEmployeeSalary();

    //Not Equal <> in SQL
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //Like / Contains / StartsWith /Endswith
    //Like is a logical operator that is used to determine whether a specific character string matches a specified pattern.
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //Less than, Greater than
    @Query("SELECT e FROM Employee e WHERE e.salary< ?1")
    List<Employee> retrieveEmployeeSalaryLessThan(int salary);
    @Query("SELECT e.firstName FROM Employee e WHERE e.salary> ?1")
    List<String> retrieveEmployeeSalaryGreaterThan(int salary);

    //Between
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> retrieveEmployeeSalaryBetween(int salary1, int salary2);

    //Before
    @Query("SELECT e FROM Employee e WHERE e.hireDate> ?1")
    List<Employee> retrieveEmployeeHireDateBefore (LocalDate date);

    //NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> retrieveEmployeeEmailIsNull();

    //NOT NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> retrieveEmployeeEmailIsNotNull();

    //SORTING in asc order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> retrieveEmployeeSalaryOrderAsc();


    //SORTING in desc order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> retrieveEmployeeSalaryOrderDesc();
}
