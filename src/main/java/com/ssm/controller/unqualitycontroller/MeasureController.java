package com.ssm.controller.unqualitycontroller;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.qualitybean.F_Measure;
import com.ssm.bean.qualitybean.QualityJson;
import com.ssm.service.quailtyservice.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/erp")
public class MeasureController {

    @Autowired
    MeasureService measureService;
    @Autowired
    QualityJson qualityJson;

    @RequestMapping("measure/list")
    @ResponseBody
    public QualityJson measureList(){
        List<F_Measure> measureList = measureService.queryMeasureList();
        qualityJson.setTotal(measureList.size());
        qualityJson.setRows(measureList);
        return qualityJson;
    }

    @RequestMapping("measure/find")
    public String measure(){
        return "measurement_list";
    }

    @RequestMapping("fMeasureCheck/add_judge")
    public String measureAddJudge(){
        return "measurement_add";
    }

    @RequestMapping("measure/add")
    public String measureAdd(){
        return "measurement_add";
    }

    @RequestMapping("measure/insert")
    @ResponseBody
    public QueryStatus measureInsert(F_Measure fMeasure){
        int i = measureService.insert(fMeasure);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "insert fail");
        }
    }

    @RequestMapping("fMeasureCheck/edit_judge")
    public String measureEditJudge(){
        return "measurement_edit";
    }

    @RequestMapping("measure/edit")
    public String measureEdit(){
        return "measurement_edit";
    }

    @RequestMapping("measure/update_all")
    @ResponseBody
    public QueryStatus measureUpadteAll(F_Measure fMeasure){
        int i = measureService.upadteMeasure(fMeasure);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "update fail");
        }
    }

    @RequestMapping("fMeasureCheck/delelte_judge")
    public String measureDeleteJudge(){return "measurement_list";}

    @RequestMapping("measure/delete_batch")
    @ResponseBody
    public QueryStatus measureDelete(String[] ids){
        int i = measureService.deleteMeasures(ids);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "delete fail");
        }
    }

    @RequestMapping("measure/search_fMeasureCheck_by_orderId")
    @ResponseBody
    public QualityJson queryMeasureByOrderId(String searchValue){
        List<F_Measure> measureList = measureService.queryMeasureByOrderId(searchValue);
        qualityJson.setTotal(measureList.size());
        qualityJson.setRows(measureList);
        return qualityJson;
    }

    @RequestMapping("measure/search_fMeasureCheck_by_fMeasureCheckId")
    @ResponseBody
    public QualityJson queryMeasureByCheckId(String searchValue){
        List<F_Measure> measureList = measureService.queryMeasureByCheckId(searchValue);
        qualityJson.setTotal(measureList.size());
        qualityJson.setRows(measureList);
        return qualityJson;
    }
}
