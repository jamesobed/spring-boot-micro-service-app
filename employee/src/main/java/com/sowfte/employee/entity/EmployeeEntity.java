package com.sowfte.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
//    @Id
//    @GeneratedValue
    private Long employeeID;
    private String employeeName;
    private String employeeCountry;
    private Long departmentId;

}
