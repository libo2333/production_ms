package com.ssm.service.quailtyservice;


import com.ssm.bean.QueryStatus;
import com.ssm.bean.qualitybean.Unqualify;

import java.util.List;

public interface UnqualityService {
    List<Unqualify> queryUnqualityList();

    int insert(Unqualify unqualify);

    List<Unqualify> unqualifySearchById(String searchValue);

    List<Unqualify> unqualifySearchByName(String searchValue);

    int upadteUnqualify(Unqualify unqualify);

    int deleteUnqualities(String[] ids);
}
