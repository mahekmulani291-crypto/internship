package com.example.employeemanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class EmployeeRequestDto {

    @NotBlank(message = "Name must not be empty")
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email must not be empty")
    private String email;

    @NotBlank(message = "Department must not be empty")
    private String department;

    @NotNull(message = "Salary must not be null")
    @Positive(message = "Salary must be greater than zero")
    private BigDecimal salary;

    @NotBlank(message = "Status must not be empty")
    private String status;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
