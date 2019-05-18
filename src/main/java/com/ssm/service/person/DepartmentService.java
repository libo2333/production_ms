package com.ssm.service.person;

import com.ssm.bean.person.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> selectDepartmentList();

    List<Department> searchDepartmentListById(String id);
}
