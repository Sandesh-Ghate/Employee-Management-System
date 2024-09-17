package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeSerive {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
