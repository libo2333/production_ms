package com.ssm.controller.unqualitycontroller;

import com.ssm.bean.qualitybean.QualityJson;
import com.ssm.bean.qualitybean.Unqualify;
import com.ssm.service.quailtyservice.UnqualityService;
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
}
