package com.sowfte.employee.repository;

import com.sowfte.employee.entity.DepartmentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository  {
    private List<DepartmentEntity> allDepartments = new ArrayList<>();

    public  DepartmentEntity addDepartment(DepartmentEntity payload){
        allDepartments.add(payload);

        return  payload;
    }
    public  DepartmentEntity findDepartment(Long payload){
        return  allDepartments.stream().filter(departmentEntity -> departmentEntity.getDepartmentID() == payload)
                .findFirst()
                .orElseThrow();

    }

    public  List<DepartmentEntity> getAllDepartments(){
        return allDepartments;

    }
}
