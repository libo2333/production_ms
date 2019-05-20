package com.ssm.controller.person;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.person.Department;
import com.ssm.bean.person.DepartmentJson;
import com.ssm.service.person.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    public DepartmentJson Department1(int page, int rows){
        List<Department> departments = departmentService.selectDepartmentList();
        List<Department> departments1 = departments.subList((page-1) * rows, ((page) * rows)>=departments.size()?departments.size():((page)*rows));
        departmentJson.setTotal(departments.size());
        departmentJson.setRows(departments1);
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
    @ResponseBody
    public QueryStatus department7(String departmentId, String departmentName, String note){
        Department department = new Department(departmentId, departmentName, note);
        List<Department> departments = departmentService.searchDepartmentListById(departmentId);
        //重复则提示该部门已存在
        if(departments.size() == 0){
            departmentService.insertDepartment(department);
            QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
            return queryStatus;
        }else{
            return new QueryStatus(100,"该部门已存在","1");
        }

    }

    /*删除功能*/
    @RequestMapping("department/delete_judge")
    public String department8(){
        return "department_list";
    }

    @RequestMapping("department/delete_batch")
    @ResponseBody
    public QueryStatus department9(String ids){
        departmentService.deleteDepartmentById(ids);
        QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
        return queryStatus;
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
    @ResponseBody
    public QueryStatus department12(String departmentId,String departmentName,String note){
        departmentService.editDepartment(departmentId,departmentName,note);
        QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
        return queryStatus;
    }

    /*get_data*/
    @RequestMapping("department/get_data")
    @ResponseBody
    public List<Department> department13(){
        List<Department> departments = departmentService.selectDepartmentList();
        return departments;
    }

    /*update_note*/
    @RequestMapping("department/update_note")
    @ResponseBody
    public QueryStatus department14(String departmentId,String note){
        departmentService.updateNoteById(departmentId,note);
        QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
        return queryStatus;
    }

    /*get*/
    @RequestMapping("department/get/*")
    @ResponseBody
    public Department employee15(HttpServletRequest request){
        StringBuffer requestURL = request.getRequestURL();
        int i = requestURL.lastIndexOf("/");
        String substring = requestURL.substring(i+1, requestURL.length());
        Department department = departmentService.searchDepartmentById(substring);
        return department;
    }
}
