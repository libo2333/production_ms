package com.ssm.controller.unqualitycontroller;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.qualitybean.P_Count;
import com.ssm.bean.qualitybean.QualityJson;
import com.ssm.service.quailtyservice.PCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/erp")
public class PCountController {

    @Autowired
    PCountService pCountService;
    @Autowired
    QualityJson qualityJson;

    @RequestMapping("p_count_check/list")
    @ResponseBody
    public QualityJson queryPCountList(){
        List<P_Count> pCountList = pCountService.queryPCountList();
        qualityJson.setTotal(pCountList.size());
        qualityJson.setRows(pCountList);
        return qualityJson;
    }

    @RequestMapping("p_count_check/find")
    public String pCount(){
        return "p_count_check_list";
    }

    @RequestMapping("p_count_check/search_pCountCheck_by_pCountCheckId")
    @ResponseBody
    public QualityJson queryPCountByCheckId(String searchValue){
        List<P_Count> pCountList = pCountService.queryPCountByCheckId(searchValue);
        qualityJson.setTotal(pCountList.size());
        qualityJson.setRows(pCountList);
        return qualityJson;
    }

    @RequestMapping("p_count_check/search_pCountCheck_by_orderId")
    @ResponseBody
    public QualityJson queryPCountByOrderId(String searchValue){
        List<P_Count> pCountList = pCountService.queryPCountByOrderId(searchValue);
        qualityJson.setTotal(pCountList.size());
        qualityJson.setRows(pCountList);
        return qualityJson;
    }

    @RequestMapping("pCountCheck/add_judge")
    public String pCountAddJudge(){
        return "p_count_check_add";
    }

    @RequestMapping("p_count_check/add")
    public String pCountAdd(){
        return "p_count_check_add";
    }

    @RequestMapping("p_count_check/insert")
    @ResponseBody
    public QueryStatus pCountInsert(P_Count pCount){
        int i = pCountService.insertPCount(pCount);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "insert fail");
        }
    }

    @RequestMapping("pCountCheck/edit_judge")
    public String pCountEditJudge(){
        return "p_count_check_edit";
    }

    @RequestMapping("p_count_check/edit")
    public String pCountEdit(){
        return "p_count_check_edit";
    }

    @RequestMapping("p_count_check/update_all")
    @ResponseBody
    public QueryStatus pCountUpadteAll(P_Count pCount){
        int i = pCountService.upadtePCount(pCount);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "update fail");
        }
    }

    @RequestMapping("pCountCheck/delete_judge")
    public String pCountDeleteJudge(){
        return "p_count_check_list";
    }

    @RequestMapping("p_count_check/delete_batch")
    @ResponseBody
    public QueryStatus pCountDelete(String[] ids){
        int i = pCountService.deletePCount(ids);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "delete fail");
        }
    }
}
