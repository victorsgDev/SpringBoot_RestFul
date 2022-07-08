package com.example.springbootapirest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public Department() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Department{");
        sb.append("departmentId=").append(departmentId);
        sb.append(", departmentName='").append(departmentName).append('\'');
        sb.append(", departmentAddress='").append(departmentAddress).append('\'');
        sb.append(", departmentCode='").append(departmentCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
