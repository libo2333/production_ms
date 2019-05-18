package com.ssm.controller.person;

import com.ssm.bean.person.Department;
import com.ssm.bean.person.DepartmentJson;
import com.ssm.service.person.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

    /*List*/
    @RequestMapping("department/list")
    @ResponseBody
    public DepartmentJson Department1(){
        List<Department> departments = departmentService.selectDepartmentList();
       // System.out.println(departments);
        departmentJson.setTotal(departments.size());
        departmentJson.setRows(departments);
        return departmentJson;
    }

    @RequestMapping("department/find")
    public String department2(){
        return "department_list";
    }



    /*搜索功能*/
    @RequestMapping("department/search_department_by_departmentId")
    @ResponseBody
    public DepartmentJson department4(String searchValue){
        List<Department> departments = departmentService.searchDepartmentListById(searchValue);
        departmentJson.setTotal(departments.size());
        departmentJson.setRows(departments);
        return  departmentJson;
    }

    @RequestMapping("department/search_department_by_departmentName")
    @ResponseBody
    public DepartmentJson department5(String searchValue){
        List<Department> departments = departmentService.searchDepartmentListByName(searchValue);
        departmentJson.setTotal(departments.size());
        departmentJson.setRows(departments);
        return departmentJson;
    }
    /*添加功能*/
    @RequestMapping("department/add_judge")
    public String department3(){
        return "department_add";
    }

    @RequestMapping("department/add")
    public String department6(){
        return "department_add";
    }

    @RequestMapping("department/insert")
    //@ResponseBody
    public String department7(String departmentId,String departmentName,String note){
        Department department = new Department(departmentId, departmentName, note);
        departmentService.insertDepartment(department);
        return "department_list";
    }

    /*删除功能*/
    @RequestMapping("department/delete_judge")
    public String department8(){
        return "department_list";
    }

    @RequestMapping("department/delete_batch")
    //@ResponseBody
    public String department9(String ids){
        departmentService.deleteDepartmentById(ids);
        return "department_list";
    }

    /*编辑功能*/
    @RequestMapping("department/edit_judge")
    public String department10(){
        return "department_edit";
    }

    @RequestMapping("department/edit")
    public String department11(){
        return "department_edit";
    }

    @RequestMapping("department/update_all")
    public String department12(String departmentId,String departmentName,String note){
        departmentService.editDepartment(departmentId,departmentName,note);
        return "department_list";
    }
}
