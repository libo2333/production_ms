package com.ssm.service.quailtyservice.impl;

import com.ssm.bean.qualitybean.Unqualify;
import com.ssm.mapper.qualitymapper.UnqualifyMapper;
import com.ssm.service.quailtyservice.UnqualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnqualityServiceImpl implements UnqualityService {

    @Autowired
    UnqualifyMapper unqualifyMapper;

    @Override
    public List<Unqualify> queryUnqualityList() {
        List<Unqualify> unqualifyList = unqualifyMapper.queryUnqualityList();
        return unqualifyList;
    }
}
