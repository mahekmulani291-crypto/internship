package com.example.employeemanagement.repository;

import com.example.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query
    List<Employee> findByDepartmentAndStatus(String department, String status);

    // Derived query
    List<Employee> findByNameContainingIgnoreCaseAndDepartment(
            String name, String department);

    // JPQL query
    @Query("""
        SELECT e FROM Employee e
        WHERE e.salary BETWEEN :min AND :max
    """)
    List<Employee> findEmployeesBySalaryRange(
            @Param("min") BigDecimal min,
            @Param("max") BigDecimal max
    );

    // Date range
    List<Employee> findByCreatedAtBetween(
            LocalDateTime start,
            LocalDateTime end
    );
}
