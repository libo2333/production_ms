package com.ssm.mapper.person;

import com.ssm.bean.person.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectEmployeeList();

    List<Employee> searchEmployeeListById(String id);

    List<Employee> searchEmployeeListByName(String name);

    List<Employee> searchEmployeeListByDepartmentName(String name);

    int insertEmployee(Employee employee);

    void deleteEmployeeById(String ids);

    void editEmployee(Employee employee);
}