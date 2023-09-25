package com.sowfte.employee.repository;

import com.sowfte.employee.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<EmployeeEntity> allDepartments = new ArrayList<>();

    public EmployeeEntity addDepartment(EmployeeEntity payload){
        allDepartments.add(payload);

        return  payload;
    }
    public EmployeeEntity findDepartmentId(Long payload){
        return  allDepartments.stream().filter(employeeEntity -> employeeEntity.getDepartmentId() == payload)
                .findFirst()
                .orElseThrow();

    } public List<EmployeeEntity> findDepartment(Long payload){
        return  allDepartments.stream().filter(employeeEntity -> employeeEntity.getDepartmentId() == payload)
                .toList();

    }

    public  List<EmployeeEntity> getAllDepartments(){
        return allDepartments;

    }
}
