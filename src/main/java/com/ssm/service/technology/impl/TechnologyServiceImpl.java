package com.ssm.service.technology.impl;

import com.github.pagehelper.PageHelper;
import com.ssm.bean.QueryStatus;
import com.ssm.bean.technology.ResponseVo;
import com.ssm.bean.technology.Technology;
import com.ssm.mapper.technology.TechnologyMapper;
import com.ssm.service.technology.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {


    @Autowired
    TechnologyMapper technologyMapper;

    @Override
    public ResponseVo requireResponseVo(Integer page, Integer rows) {
        ResponseVo<Technology> technologyResponseVo = new ResponseVo<>();
        List<Technology> technologies = technologyMapper.queryTechnologies();
        technologyResponseVo.setRows(technologies);
        technologyResponseVo.setTotal(technologies.size());
        return technologyResponseVo;
    }

    @Override
    public QueryStatus insertTechnology(Technology technology) {
        int i = technologyMapper.insertTechnology(technology);
        QueryStatus queryStatus = new QueryStatus();

        return i == 1;
    }
}
