package com.example.employeemanagementsystem.dto;

public class DepartmentDTO {

    private Long id;
    private String name;
    private Long employeeCount;

    public DepartmentDTO(Long id, String name, Long employeeCount) {
        this.id = id;
        this.name = name;
        this.employeeCount = employeeCount;
    }

}
