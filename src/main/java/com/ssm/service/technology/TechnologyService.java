package com.ssm.service.technology;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.technology.ResponseVo;
import com.ssm.bean.technology.Technology;

public interface TechnologyService {


    ResponseVo requireResponseVo(Integer page, Integer rows);

    QueryStatus insertTechnology(Technology technology);
}
