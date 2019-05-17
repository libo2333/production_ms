package com.ssm.service.people.impl;

import com.ssm.bean.person.Department;
import com.ssm.mapper.person.DepartmentMapper;
import com.ssm.service.people.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectDepartmentList() {

        return departmentMapper.selectDepartmentList();
    }
}
