package com.ssm.service.people;

import com.ssm.bean.person.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> selectDepartmentList();
}
