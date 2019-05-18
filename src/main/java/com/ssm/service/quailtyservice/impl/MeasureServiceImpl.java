package com.ssm.service.quailtyservice.impl;

import com.ssm.bean.qualitybean.F_Measure;
import com.ssm.mapper.qualitymapper.MeasureMapper;
import com.ssm.service.quailtyservice.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasureServiceImpl implements MeasureService {

    @Autowired
    MeasureMapper measureMapper;

    @Override
    public List<F_Measure> queryMeasureList() {
        List<F_Measure> measureList = measureMapper.queryMeasureList();
        return measureList;
    }

    @Override
    public List<F_Measure> queryMeasureByOrderId(String searchValue) {
        List<F_Measure> measureList = measureMapper.queryMeasureByOrderId(searchValue);
        return measureList;
    }

    @Override
    public List<F_Measure> queryMeasureByCheckId(String searchValue) {
        List<F_Measure> measureList = measureMapper.queryMeasureByCheckId(searchValue);
        return measureList;
    }

}
