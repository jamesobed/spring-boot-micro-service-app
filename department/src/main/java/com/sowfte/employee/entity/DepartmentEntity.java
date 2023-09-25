package com.sowfte.employee.entity;

import com.sowfte.employee.dto.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentEntity {
//    @Id
//    @GeneratedValue
    private Long departmentID;
    private String departmentName;
    private String departmentCode;
    private List<Employee> departEmployee = new ArrayList<>();
}
