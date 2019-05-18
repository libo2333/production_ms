package com.ssm.controller.unqualitycontroller;

import com.ssm.bean.qualitybean.F_Count;
import com.ssm.bean.qualitybean.QualityJson;
import com.ssm.service.quailtyservice.FCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/erp")
public class FCountController {

    @Autowired
    FCountService fCountService;
    @Autowired
    QualityJson qualityJson;

    @RequestMapping("f_count_check/list")
    @ResponseBody
    public QualityJson queryFCountList(){
        List<F_Count> fCountList = fCountService.queryFCountList();
        qualityJson.setTotal(fCountList.size());
        qualityJson.setRows(fCountList);
        return qualityJson;
    }

    @RequestMapping("f_count_check/find")
    public String fCount(){
        return "f_count_check_list";
    }

    @RequestMapping("f_count_check/search_fCountCheck_by_fCountCheckId")
    @ResponseBody
    public QualityJson queryFCountByCheckId(String searchValue){
        List<F_Count> fCountList = fCountService.queryFCountByCheckId(searchValue);
        qualityJson.setTotal(fCountList.size());
        qualityJson.setRows(fCountList);
        return qualityJson;
    }

    @RequestMapping("f_count_check/search_fCountCheck_by_orderId")
    @ResponseBody
    public QualityJson queryFCountByOrderId(String searchValue){
        List<F_Count> fCountList = fCountService.queryFCountByOrderId(searchValue);
        qualityJson.setTotal(fCountList.size());
        qualityJson.setRows(fCountList);
        return qualityJson;
    }
}
