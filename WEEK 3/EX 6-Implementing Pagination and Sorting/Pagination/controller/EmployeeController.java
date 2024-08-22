package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/department/{departmentId}")
    public Page<Employee> getEmployeesByDepartment(
            @PathVariable("departmentId") Long departmentId, 
            Pageable pageable) {
        return employeeService.getEmployeesByDepartment(departmentId, pageable);
    }

    @GetMapping("/search")
    public Page<Employee> searchEmployeesByName(
            @RequestParam("name") String name, 
            Pageable pageable) {
        return employeeService.searchEmployeesByName(name, pageable);
    }

    @GetMapping("/email")
    public Page<Employee> getEmployeesByEmail(
            @RequestParam("email") String email, 
            Pageable pageable) {
        return employeeService.getEmployeesByEmail(email, pageable);
    }

}
