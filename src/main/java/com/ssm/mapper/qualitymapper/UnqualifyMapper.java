package com.ssm.mapper.qualitymapper;

import com.ssm.bean.qualitybean.Unqualify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnqualifyMapper {


    List<Unqualify> queryUnqualityList();


    int insertUnqualify(Unqualify unqualify);

    List<Unqualify> unqualifySearchById(String searchValue);

    List<Unqualify> unqualifySearchByName(String searchValue);

    int updateUnqualify(Unqualify unqualify);

    int deleteUnqualities(String[] ids);
}