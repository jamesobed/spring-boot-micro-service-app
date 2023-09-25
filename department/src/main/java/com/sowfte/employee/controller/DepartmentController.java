package com.sowfte.employee.controller;

import com.sowfte.employee.client.EmployeeClient;
import com.sowfte.employee.entity.DepartmentEntity;
import com.sowfte.employee.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/department")
public class DepartmentController {
    private final DepartmentRepository departmentRepository;

    private  final EmployeeClient employeeClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping()
    public DepartmentEntity createDepartment( @RequestBody DepartmentEntity payload){
        return departmentRepository.addDepartment(payload);
    }

    @GetMapping()
    public List<DepartmentEntity> getAllDepartment(){
        return departmentRepository.getAllDepartments();
    }

    @GetMapping("/{id}")
    public DepartmentEntity getDepartmentByID( @PathVariable("id") Long id){
        return departmentRepository.findDepartment(id);
    }
    @GetMapping("/with-employees")
    public List<DepartmentEntity> getAllCompleteDepartment(){
        List <DepartmentEntity> depts =  departmentRepository.getAllDepartments();

        depts.forEach(i->i.setDepartEmployee(
                employeeClient.findDepartment(i.getDepartmentID())
        ));

        return  depts;
    }
}
