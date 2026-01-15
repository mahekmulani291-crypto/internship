package com.example.employeemanagement.controller;

import com.example.employeemanagement.dto.EmployeeRequestDto;
import com.example.employeemanagement.dto.EmployeeResponseDto;
import com.example.employeemanagement.service.EmployeeService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(
            @Valid @RequestBody EmployeeRequestDto requestDto) {
        return new ResponseEntity<>(service.createEmployee(requestDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> getEmployee(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> getAllEmployees() {
        return ResponseEntity.ok(service.getAllEmployees());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequestDto requestDto) {
        return ResponseEntity.ok(service.updateEmployee(id, requestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
