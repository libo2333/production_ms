package com.ssm.mapper.qualitymapper;

import com.ssm.bean.qualitybean.P_Measure;

import java.util.List;

public interface PMeasureMapper {
    List<P_Measure> queryPMeasureList();

    List<P_Measure> queryPMeasureByOrderId(String searchValue);

    List<P_Measure> queryPMeasureByCheckId(String searchValue);

    int deletePMeasures(String[] ids);

    int upadtePMeasure(P_Measure pMeasure);

    int insertPMeasure(P_Measure pMeasure);
}
