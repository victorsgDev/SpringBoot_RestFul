package com.example.springbootapirest.service;

import com.example.springbootapirest.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();
}
