package com.ssm.controller.unqualitycontroller;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.qualitybean.QualityJson;
import com.ssm.bean.qualitybean.Unqualify;
import com.ssm.service.quailtyservice.UnqualityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/erp")
public class QualityController {
    @Autowired
    UnqualityService unqualityService;
    @Autowired
    QualityJson qualityJson;

    @RequestMapping("unqualify/list")
    @ResponseBody
    public QualityJson unqualityList(){
        List<Unqualify> unqualifyList = unqualityService.queryUnqualityList();
        qualityJson.setTotal(unqualifyList.size());
        qualityJson.setRows(unqualifyList);
        return qualityJson;
    }

    @RequestMapping("unqualify/find")
    public String unquality(){
        return "unqualify_list";
    }

    @RequestMapping("unqualify/add_judge")
    public String unqualityAddJudge(){
        return "unqualify_add";
    }

    @RequestMapping("unqualify/add")
    public String unqualityAdd(){
        return "unqualify_add";
    }

    @RequestMapping("unqualify/delete_judge")
    public String unqualityDeleteJudge(){
        return "unqualify_list";
    }

    @RequestMapping("unqualify/delete_batch")
    @ResponseBody
    public QueryStatus unqualityDelete(String[] ids){
        int i = unqualityService.deleteUnqualities(ids);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "delete fail");
        }
    }

    @RequestMapping("unqualify/insert")
    @ResponseBody
    public QueryStatus unqualifyInsert(@Param("uqualify") Unqualify unqualify){
        int i = unqualityService.insert(unqualify);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "insert fail");
        }
    }

    @RequestMapping("unqualify/search_unqualify_by_unqualifyId")
    @ResponseBody
    public QualityJson unqualifySearchById(String searchValue){
        List<Unqualify> unqualifyList = unqualityService.unqualifySearchById(searchValue);
        qualityJson.setTotal(unqualifyList.size());
        qualityJson.setRows(unqualifyList);
        return qualityJson;
    }

    @RequestMapping("unqualify/search_unqualify_by_productName")
    @ResponseBody
    public QualityJson unqualifySearchByName(String searchValue){
        List<Unqualify> unqualifyList = unqualityService.unqualifySearchByName(searchValue);
        qualityJson.setTotal(unqualifyList.size());
        qualityJson.setRows(unqualifyList);
        return qualityJson;
    }

    @RequestMapping("unqualify/edit_judge")
    public String unqualityEditJudge(){
        return "unqualify_edit";
    }

    @RequestMapping("unqualify/edit")
    public String unqualityEdit(){
        return "unqualify_edit";
    }

    @RequestMapping("unqualify/update_all")
    @ResponseBody
    public QueryStatus unqualityUpadteAll(Unqualify unqualify){
        int i = unqualityService.upadteUnqualify(unqualify);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "update fail");
        }
    }
}
