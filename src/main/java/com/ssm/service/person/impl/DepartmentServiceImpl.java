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
        //System.out.println(departments);
        return departments;
    }

    @Override
    public List<Department> searchDepartmentListById(String id) {
        List<Department> departments = departmentMapper.searchDepartmentListById(id);
        return departments;
    }

    @Override
    public List<Department> searchDepartmentListByName(String name) {
        List<Department> departments = departmentMapper.searchDepartmentListByName(name);
        return departments;
    }

    @Override
    public int insertDepartment(Department department) {
        return departmentMapper.insertDepartment(department);
    }

    @Override
    public int deleteDepartmentById(String id) {
        return departmentMapper.deleteDepartmentById(id);
    }

    @Override
    public int editDepartment(String departmentId, String departmentName, String note) {
        return departmentMapper.editDepartment(departmentId,departmentName,note);
    }


}
