package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue

    private long empId;

    private String empName;

    private double empSalary;

}
