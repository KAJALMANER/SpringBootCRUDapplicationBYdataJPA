package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public List<Employee> getAllData() {
        return employeeDao.getAllData();
    }

    public Employee saveData(Employee employee) {
        return employeeDao.saveData(employee);

    }

    public Employee updataData(Employee employee) {
        return employeeDao.updataData(employee);
    }

    public void  deleteData(long empId) {

         employeeDao.deleteData(empId);
    }
}
