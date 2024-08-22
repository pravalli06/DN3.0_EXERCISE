package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
    @Query("SELECT d FROM Department d JOIN d.employees e GROUP BY d HAVING COUNT(e) > ?1")
    List<Department> findDepartmentsWithMoreThanXEmployees(int numberOfEmployees);
}
