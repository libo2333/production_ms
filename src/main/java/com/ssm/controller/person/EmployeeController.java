package com.ssm.controller.person;


import com.ssm.bean.QueryStatus;
import com.ssm.bean.person.Employee;
import com.ssm.bean.person.EmployeeJson;
import com.ssm.service.person.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/erp/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeJson employeeJson;


    /*List*/
    @RequestMapping("find")
    public String employee1(){
        return "employee_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public EmployeeJson employee2(){
        List<Employee> employees = employeeService.selectEmployeeList();
        employeeJson.setTotal(employees.size());
        employeeJson.setRows(employees);
        return employeeJson;
    }

    /*新增功能*/
    @RequestMapping("add_judge")
    public String employee3(){
        return "employee_add";
    }

    @RequestMapping("add")
    public String employee4(){
        return "employee_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public QueryStatus employee5(String joinDate){
        System.out.println(joinDate);
        QueryStatus queryStatus = new QueryStatus(100,"请输入正确身份证号",null);
        return queryStatus;
    }
}
