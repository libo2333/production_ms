package com.ssm.service.person.impl;

import com.ssm.bean.person.Employee;
import com.ssm.mapper.person.DepartmentMapper;
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

    @Override
    public List<Employee> searchEmployeeListById(String id) {
        return employeeMapper.searchEmployeeListById(id);
    }

    @Override
    public List<Employee> searchEmployeeListByName(String name) {
        List<Employee> employees = employeeMapper.searchEmployeeListByName(name);
        return employees;
    }

    @Override
    public List<Employee> searchEmployeeListByDepartmentName(String name) {
        return employeeMapper.searchEmployeeListByDepartmentName(name);
    }

    @Override
    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(String ids) {
        employeeMapper.deleteEmployeeById(ids);
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeMapper.editEmployee(employee);
    }
}
