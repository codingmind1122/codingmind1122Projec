package com.newyear.rk.service;

import java.util.List;

import com.newyear.rk.entity.Employee;
 
 
public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
