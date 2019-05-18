package com.ssm.service.quailtyservice.impl;

import com.ssm.bean.qualitybean.F_Count;
import com.ssm.mapper.qualitymapper.FCountMapper;
import com.ssm.service.quailtyservice.FCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FCountServiceImpl implements FCountService {

    @Autowired
    FCountMapper fCountMapper;

    @Override
    public List<F_Count> queryFCountList() {
        List<F_Count> fCountList = fCountMapper.queryFCountList();
        return fCountList;
    }

    @Override
    public List<F_Count> queryFCountByCheckId(String searchValue) {
        List<F_Count> fCountList = fCountMapper.queryFCountByCheckId(searchValue);
        return fCountList;
    }

    @Override
    public List<F_Count> queryFCountByOrderId(String searchValue) {
        List<F_Count> fCountList = fCountMapper.queryFCountByOrderId(searchValue);
        return fCountList;
    }
}
