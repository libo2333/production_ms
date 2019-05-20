package com.ssm.controller.technology;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.technology.ResponseVo;

import com.ssm.bean.technology.Technology;
import com.ssm.service.technology.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/erp")
public class TechnologyController {


    @Autowired
    TechnologyService technologyService;
    @RequestMapping("home")
    public String home(){
        return "home";
    }

    @RequestMapping("technology/list")
    @ResponseBody
    public ResponseVo technology(Integer page,Integer rows){

        ResponseVo responseVo = technologyService.requireResponseVo(page,rows);
        return responseVo;

    }
    @RequestMapping("technology/find")
    public String technology1(){
        return "technology_list";
    }
    @RequestMapping("technology/add_judge")
    public String technology2(){
        return "technology_add";
    }
    @RequestMapping("technology/add")
    public String technology3(){
        return "technology_add";
    }
    @RequestMapping("technology/insert")
    public QueryStatus technology4(Technology technology){
        QueryStatus queryStatus =  technologyService.insertTechnology(technology);
        return queryStatus;
    }


}
