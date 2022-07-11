package com.example.springbootapirest.service;

import com.example.springbootapirest.entity.Department;
import org.springframework.stereotype.Service;

public interface DepartmentService {
    public Department saveDepartment(Department department);
}
