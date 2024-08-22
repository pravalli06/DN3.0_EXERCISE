package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Department;
import com.example.employeemanagementsystem.projection.DepartmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d.id AS id, d.name AS name, COUNT(e) AS employeeCount FROM Department d LEFT JOIN d.employees e GROUP BY d.id")
    Page<DepartmentProjection> findDepartmentProjections(Pageable pageable);
}
