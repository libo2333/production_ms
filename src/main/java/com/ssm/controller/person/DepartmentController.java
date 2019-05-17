package com.ssm.controller.person;

import com.ssm.bean.person.Department;
import com.ssm.bean.person.DepartmentJson;
import com.ssm.service.people.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/erp")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @Autowired
    DepartmentJson departmentJson;

    @RequestMapping("department/list")
    @ResponseBody
    public DepartmentJson Department1(){
        List<Department> departments = departmentService.selectDepartmentList();
        departmentJson.setTotal(departments.size());
        departmentJson.setRows(departments);
        return departmentJson;
    }

    @RequestMapping("department/find")
    public String department2(){
        return "department_list";
    }
}
