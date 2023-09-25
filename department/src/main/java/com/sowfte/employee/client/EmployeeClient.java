package com.sowfte.employee.client;

import com.sowfte.employee.dto.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("/api/v1/employee/department/{department-id}")
    public List<Employee> findDepartment(@PathVariable("department-id") Long id);

    }
