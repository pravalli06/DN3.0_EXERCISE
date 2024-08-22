package com.example.employeemanagementsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
@NamedQueries({
    @NamedQuery(name = "Employee.findByDepartmentName",
                query = "SELECT e FROM Employee e WHERE e.department.name = :departmentName"),
    @NamedQuery(name = "Employee.findByEmailDomain",
                query = "SELECT e FROM Employee e WHERE e.email LIKE :domain")
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
