package com.example.springbootapirest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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


}
