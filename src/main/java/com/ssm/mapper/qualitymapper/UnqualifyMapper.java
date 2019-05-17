package com.ssm.mapper.qualitymapper;

import com.ssm.bean.qualitybean.Unqualify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnqualifyMapper {


    List<Unqualify> queryUnqualityList();


}