package com.ssm.service.quailtyservice;

import com.ssm.bean.qualitybean.F_Measure;

import java.util.List;

public interface MeasureService {
    List<F_Measure> queryMeasureList();

    List<F_Measure> queryMeasureByOrderId(String searchValue);

    List<F_Measure> queryMeasureByCheckId(String searchValue);

    int deleteMeasures(String[] ids);

    int upadteMeasure(F_Measure fMeasure);

    int insert(F_Measure fMeasure);
}
