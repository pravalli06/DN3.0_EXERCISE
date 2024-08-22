package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Paginated and sorted query
    Page<Employee> findByDepartmentId(Long departmentId, Pageable pageable);
    
    // Paginated and sorted query for search by name
    Page<Employee> findByNameContainingIgnoreCase(String name, Pageable pageable);
    
    // Find employees by email with pagination and sorting
    Page<Employee> findByEmail(String email, Pageable pageable);
}
