package com.newyear.rk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newyear.rk.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 
}
