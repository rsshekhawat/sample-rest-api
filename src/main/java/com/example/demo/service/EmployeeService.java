package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long id);
}

