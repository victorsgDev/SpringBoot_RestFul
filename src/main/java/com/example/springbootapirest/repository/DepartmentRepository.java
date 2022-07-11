package com.example.springbootapirest.repository;

import com.example.springbootapirest.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {  // Indicamos el entity y el tipo de su ID

    Department findByDepartmentNameIgnoreCase(String departmentName);
}
