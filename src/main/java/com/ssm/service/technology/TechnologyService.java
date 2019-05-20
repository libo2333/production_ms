package com.ssm.service.technology;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.QueryStatus;
import com.ssm.bean.technology.ResponseVo;
import com.ssm.bean.technology.Technology;

public interface TechnologyService {


    ResponseVo<Technology> requireResponseVo(Integer page, Integer rows);

    QueryStatus insertTechnology(Technology technology);
}
