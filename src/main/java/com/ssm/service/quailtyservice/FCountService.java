package com.ssm.service.quailtyservice;

import com.ssm.bean.qualitybean.F_Count;

import java.util.List;

public interface FCountService {
    List<F_Count> queryFCountList();

    List<F_Count> queryFCountByCheckId(String searchValue);

    List<F_Count> queryFCountByOrderId(String searchValue);

    int deleteFCount(String[] ids);

    int upadteFcount(F_Count fCount);

    int insertFCount(F_Count fCount);
}
