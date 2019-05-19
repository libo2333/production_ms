package com.ssm.service.person;

import com.ssm.bean.person.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> selectEmployeeList();
}
