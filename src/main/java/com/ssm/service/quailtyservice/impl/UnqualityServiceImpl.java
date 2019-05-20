package com.ssm.service.quailtyservice.impl;

import com.ssm.bean.QueryStatus;
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

    @Override
    public int insert(Unqualify unqualify) {
        int ret = unqualifyMapper.insertUnqualify(unqualify);
        return ret;
    }

    @Override
    public List<Unqualify> unqualifySearchById(String searchValue) {
        List<Unqualify> unqualifyList = unqualifyMapper.unqualifySearchById(searchValue);
        return unqualifyList;
    }

    @Override
    public List<Unqualify> unqualifySearchByName(String searchValue) {
        List<Unqualify> unqualifyList = unqualifyMapper.unqualifySearchByName(searchValue);
        return unqualifyList;
    }

    @Override
    public int upadteUnqualify(Unqualify unqualify) {
        int ret = unqualifyMapper.updateUnqualify(unqualify);
        return ret;
    }

    @Override
    public int deleteUnqualities(String[] ids) {
        int ret = unqualifyMapper.deleteUnqualities(ids);
        return ret;
    }
}
