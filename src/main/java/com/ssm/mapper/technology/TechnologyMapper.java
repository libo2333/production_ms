package com.ssm.mapper.technology;

import com.ssm.bean.technology.Technology;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TechnologyMapper {
    List<Technology> queryTechnologies();
    int insertTechnology(@Param("technology") Technology technology);

}
