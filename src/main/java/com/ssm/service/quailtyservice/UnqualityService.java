package com.ssm.service.quailtyservice;


import com.ssm.bean.QueryStatus;
import com.ssm.bean.qualitybean.Unqualify;

import java.util.List;

public interface UnqualityService {
    List<Unqualify> queryUnqualityList();

    QueryStatus insert(Unqualify unqualify);

    List<Unqualify> unqualifySearchById(String searchValue);

    List<Unqualify> unqualifySearchByName(String searchValue);
}
