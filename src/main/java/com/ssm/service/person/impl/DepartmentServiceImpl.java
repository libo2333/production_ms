package com.ssm.service.person.impl;

import com.ssm.bean.person.Department;
import com.ssm.mapper.person.DepartmentMapper;
import com.ssm.service.person.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectDepartmentList() {
        List<Department> departments = departmentMapper.selectDepartmentList();
        System.out.println(departments);
        return departments;
    }

    @Override
    public List<Department> searchDepartmentListById(String id) {
        return null;
    }
}
