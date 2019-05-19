package com.ssm.service.person.impl;

import com.ssm.bean.person.Employee;
import com.ssm.mapper.person.EmployeeMapper;
import com.ssm.service.person.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> selectEmployeeList() {
        List<Employee> employees = employeeMapper.selectEmployeeList();
        return employees;
    }
}
