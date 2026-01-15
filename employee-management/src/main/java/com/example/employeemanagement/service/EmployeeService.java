package com.example.employeemanagement.service;

import com.example.employeemanagement.dto.EmployeeRequestDto;
import com.example.employeemanagement.dto.EmployeeResponseDto;

import java.util.List;

public interface EmployeeService {

    EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto);

    EmployeeResponseDto getEmployeeById(Long id);

    List<EmployeeResponseDto> getAllEmployees();

    EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto requestDto);

    void deleteEmployee(Long id);
}
