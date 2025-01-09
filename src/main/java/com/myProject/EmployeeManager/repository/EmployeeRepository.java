package com.myProject.EmployeeManager.repository;

import com.myProject.EmployeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // method for sort by last name
    public List<Employee> findAllByOrderByLastName();

}