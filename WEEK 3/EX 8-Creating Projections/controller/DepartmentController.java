package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.dto.DepartmentDTO;
import com.example.employeemanagementsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/projections")
    public Page<DepartmentDTO> getDepartmentProjections(Pageable pageable) {
        return departmentService.getDepartmentDTOs(pageable);
    }

}
