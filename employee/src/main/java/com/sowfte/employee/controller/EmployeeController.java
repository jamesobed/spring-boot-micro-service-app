package com.sowfte.employee.controller;

import com.sowfte.employee.entity.EmployeeEntity;
import com.sowfte.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping()
    public EmployeeEntity createDepartment(@RequestBody EmployeeEntity payload){
        return employeeRepository.addDepartment(payload);
    }

    @GetMapping()
    public List<EmployeeEntity> getAllDepartment(){
        return employeeRepository.getAllDepartments();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getDepartmentByID(@PathVariable("id") Long id){
        return employeeRepository.findDepartmentId(id);
    }
    @GetMapping("/department/{department-id}")
    public List<EmployeeEntity> findDepartment(@PathVariable("department-id") Long id){
        return employeeRepository.findDepartment(id);
    }
}
