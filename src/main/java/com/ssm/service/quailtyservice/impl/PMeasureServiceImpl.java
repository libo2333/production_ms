package com.ssm.service.quailtyservice.impl;

import com.ssm.bean.qualitybean.F_Measure;
import com.ssm.bean.qualitybean.P_Measure;
import com.ssm.mapper.qualitymapper.MeasureMapper;
import com.ssm.mapper.qualitymapper.PMeasureMapper;
import com.ssm.service.quailtyservice.MeasureService;
import com.ssm.service.quailtyservice.PMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PMeasureServiceImpl implements PMeasureService {

    @Autowired
    PMeasureMapper pMeasureMapper;

    @Override
    public List<P_Measure> queryPMeasureList() {
        List<P_Measure> measureList = pMeasureMapper.queryPMeasureList();
        return measureList;
    }

    @Override
    public List<P_Measure> queryPMeasureByOrderId(String searchValue) {
        List<P_Measure> measureList = pMeasureMapper.queryPMeasureByOrderId(searchValue);
        return measureList;
    }

    @Override
    public List<P_Measure> queryPMeasureByCheckId(String searchValue) {
        List<P_Measure> measureList = pMeasureMapper.queryPMeasureByCheckId(searchValue);
        return measureList;
    }

    @Override
    public int deletePMeasures(String[] ids) {
        int ret = pMeasureMapper.deletePMeasures(ids);
        return ret;
    }

    @Override
    public int upadtePMeasure(P_Measure pMeasure) {
        int ret = pMeasureMapper.upadtePMeasure(pMeasure);
        return ret;
    }

    @Override
    public int insertPMeasure(P_Measure pMeasure) {
        int ret = pMeasureMapper.insertPMeasure(pMeasure);
        return ret;
    }

}
