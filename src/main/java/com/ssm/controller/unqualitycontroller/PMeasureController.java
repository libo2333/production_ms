package com.ssm.controller.unqualitycontroller;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.qualitybean.F_Measure;
import com.ssm.bean.qualitybean.P_Measure;
import com.ssm.bean.qualitybean.QualityJson;
import com.ssm.service.quailtyservice.MeasureService;
import com.ssm.service.quailtyservice.PMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/erp")
public class PMeasureController {

    @Autowired
    PMeasureService pMeasureService;
    @Autowired
    QualityJson qualityJson;

    @RequestMapping("p_measure_check/list")
    @ResponseBody
    public QualityJson measureList(){
        List<P_Measure> measureList = pMeasureService.queryPMeasureList();
        qualityJson.setTotal(measureList.size());
        qualityJson.setRows(measureList);
        return qualityJson;
    }

    @RequestMapping("p_measure_check/find")
    public String measure(){
        return "p_measure_check_list";
    }

    @RequestMapping("pMeasureCheck/add_judge")
    public String measureAddJudge(){
        return "p_measure_check_add";
    }

    @RequestMapping("p_measure_check/add")
    public String measureAdd(){
        return "p_measure_check_add";
    }

    @RequestMapping("pMeasureCheck/edit_judge")
    public String pMeasureEditJudge(){
        return "p_measure_check_edit";
    }

    @RequestMapping("p_measure_check/edit")
    public String pMeasureEdit(){
        return "p_measure_check_edit";
    }

    @RequestMapping("p_measure_check/update_all")
    @ResponseBody
    public QueryStatus pMeasureUpadteAll(P_Measure pMeasure){
        int i = pMeasureService.upadtePMeasure(pMeasure);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "update fail");
        }
    }

    @RequestMapping("pMeasureCheck/delelte_judge")
    public String measureDeleteJudge(){return "p_measure_check_list";}

    @RequestMapping("p_measure_check/delete_batch")
    @ResponseBody
    public QueryStatus measureDelete(String[] ids){
        int i = pMeasureService.deletePMeasures(ids);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "delete fail");
        }
    }

    @RequestMapping("p_measure_check/search_fMeasureCheck_by_orderId")
    @ResponseBody
    public QualityJson queryMeasureByOrderId(String searchValue){
        List<P_Measure> measureList = pMeasureService.queryPMeasureByOrderId(searchValue);
        qualityJson.setTotal(measureList.size());
        qualityJson.setRows(measureList);
        return qualityJson;
    }

    @RequestMapping("p_measure_check/search_pMeasureCheck_by_pMeasureCheckId")
    @ResponseBody
    public QualityJson queryMeasureByCheckId(String searchValue){
        List<P_Measure> measureList = pMeasureService.queryPMeasureByCheckId(searchValue);
        qualityJson.setTotal(measureList.size());
        qualityJson.setRows(measureList);
        return qualityJson;
    }

    @RequestMapping("p_measure_check/insert")
    @ResponseBody
    public QueryStatus pMeasureInsert(P_Measure pMeasure){
        int i = pMeasureService.insertPMeasure(pMeasure);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "insert fail");
        }
    }
}
