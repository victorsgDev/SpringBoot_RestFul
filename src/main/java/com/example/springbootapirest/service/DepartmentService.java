package com.example.springbootapirest.service;

import com.example.springbootapirest.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);
}
