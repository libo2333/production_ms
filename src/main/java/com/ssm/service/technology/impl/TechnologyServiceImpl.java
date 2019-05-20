package com.ssm.service.technology.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public ResponseVo<Technology> requireResponseVo(Integer page, Integer rows) {
        ResponseVo<Technology> technologyResponseVo = new ResponseVo<>();

        PageHelper.startPage(page, rows);
        List<Technology> technologies = technologyMapper.queryTechnologies();
        PageInfo<Technology> pageInfo = new PageInfo<>(technologies);

        technologyResponseVo.setTotal(pageInfo.getTotal());
        technologyResponseVo.setRows(technologies);
        return technologyResponseVo;


    }

    @Override
    public QueryStatus insertTechnology(Technology technology) {
        int i = technologyMapper.insertTechnology(technology);
        QueryStatus queryStatus = new QueryStatus();
        if (i == 1){
            queryStatus.setStatus(200);
            queryStatus.setMsg("ok");
        }else {
            queryStatus.setStatus(100);
            queryStatus.setMsg("添加失败");
        }
        return queryStatus;
    }
}
