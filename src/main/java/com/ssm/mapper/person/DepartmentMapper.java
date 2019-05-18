package com.ssm.mapper.person;


import com.ssm.bean.person.Department;

import java.util.List;

public interface DepartmentMapper {

    List<Department> selectDepartmentList();

    List<Department> searchDepartmentListById(String id);
}