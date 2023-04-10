package com.example.webfluxexample.service;

import com.example.webfluxexample.dto.EmployeeDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {
    Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto);

    Mono<EmployeeDto> getEmployee(String employeeId);

    Flux<EmployeeDto> getAll();

    Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId);

    Mono<Void> deleteEmployee(String employeeId);

}
