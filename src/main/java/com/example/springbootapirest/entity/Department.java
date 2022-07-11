package com.example.springbootapirest.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    /*@Email
    @Future
    @FutureOrPresent
    @Past                   // VALIDATION EXAMPLES
    @Length(max = 5, min = 1)
    @Size(max = 15, min = 1)
    @PositiveOrZero
            ... */
    @NotBlank(message = "Debes añadir un nombre de departamento")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public Department() {
    }

    public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
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
