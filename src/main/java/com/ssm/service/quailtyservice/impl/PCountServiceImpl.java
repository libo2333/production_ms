package com.ssm.service.quailtyservice.impl;

import com.ssm.bean.qualitybean.P_Count;
import com.ssm.mapper.qualitymapper.PCountMapper;
import com.ssm.service.quailtyservice.PCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCountServiceImpl implements PCountService {

    @Autowired
    PCountMapper pCountMapper;

    @Override
    public List<P_Count> queryPCountList() {
        List<P_Count> pCountList = pCountMapper.queryPCountList();
        return pCountList;
    }

    @Override
    public List<P_Count> queryPCountByCheckId(String searchValue) {
        List<P_Count> pCountList = pCountMapper.queryPCountByCheckId(searchValue);
        return pCountList;
    }

    @Override
    public List<P_Count> queryPCountByOrderId(String searchValue) {
        List<P_Count> pCountList = pCountMapper.queryPCountByOrderId(searchValue);
        return pCountList;
    }

    @Override
    public int deletePCount(String[] ids) {
        int ret = pCountMapper.deletePCount(ids);
        return ret;
    }

    @Override
    public int upadtePCount(P_Count pCount) {
        int ret = pCountMapper.upadtePCount(pCount);
        return ret;
    }

    @Override
    public int insertPCount(P_Count pCount) {
        int ret = pCountMapper.insertPCount(pCount);
        return ret;
    }
}
