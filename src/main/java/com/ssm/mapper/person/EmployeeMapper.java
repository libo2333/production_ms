package com.ssm.mapper.person;

import com.ssm.bean.person.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectEmployeeList();
}