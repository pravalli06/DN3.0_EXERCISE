package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    @Query("SELECT e FROM Employee e WHERE e.department.name = ?1")
    List<Employee> findEmployeesByDepartmentName(String departmentName);
    
    @Query(value = "SELECT * FROM employee WHERE email LIKE %?1", nativeQuery = true)
    List<Employee> findEmployeesByEmailDomain(String domain);
}
