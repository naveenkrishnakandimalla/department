package com.dailycoding.department.controller;

import com.dailycoding.department.entity.Department;
import com.dailycoding.department.service.DepartmentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private static final Logger LOGGER = Logger.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        LOGGER.info("Inside the saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside the saveDepartment method of Department Controller");
        return departmentService.findByDepartmentId(departmentId);
    }
}
