package com.example.springbootapirest.controller;

import com.example.springbootapirest.entity.Department;
import com.example.springbootapirest.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentName("IT")
                .departmentCode("IT-01")
                .departmentAddress("Barcelona")
                .departmentId(1L)
                .build();

    }

    @Test
    void saveDepartment() {
        Department inputDepartment = Department.builder()
                .departmentName("IT")
                .departmentCode("IT-01")
                .departmentAddress("Barcelona")
                .build();
        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);

        try {
            mockMvc.perform(post("/departments")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content("{\n" +
                                    "\t\"departmentName\":\"IT\",\n" +
                                    "\t\"departmentAddress\":\"Barcelona\",\n" +
                                    "\t\"departmentCode\":\"IT-01\"\n" +
                                    "}"))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void fetchDepartmentById() {
        Mockito.when(departmentService.fetchDepartmentById(1L))
                .thenReturn(department);

        try {
            mockMvc.perform(get("/departments/1")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.departmentName").
                            value(department.getDepartmentName()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}