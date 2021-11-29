package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;



    @GetMapping("/getdata")
    public ResponseEntity<List<Employee>> getAllData()
        {
            return ResponseEntity.ok(employeeService.getAllData());
    }
    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee )
    {

        return ResponseEntity.ok(employeeService.saveData(employee));
    }


    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee>  updataData(@PathVariable long empId,@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.updataData(employee));
    }


    @DeleteMapping("/deletedata/{empId}")
    public ResponseEntity<String> deleteData(@PathVariable long empId){
      employeeService.deleteData(empId);
      return ResponseEntity.ok("data deleted successfulliy");
    }

}



