package com.ssm.controller.person;

import com.ssm.bean.person.Department;
import com.ssm.bean.person.DepartmentJson;
import com.ssm.service.person.DepartmentService;
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
        System.out.println(departments);
        departmentJson.setTotal(departments.size());
        departmentJson.setRows(departments);
        return departmentJson;
    }

    @RequestMapping("department/find")
    public String department2(){
        return "department_list";
    }

    @RequestMapping("department/add_judge")
    public String department3(){
        return "department_add";
    }

    @RequestMapping("department/search_department_by_departmentId")
    public DepartmentJson department4(String searchValue){
        System.out.println(searchValue);

        return  null;
    }
}
