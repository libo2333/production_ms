package com.ssm.service.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceMaintain;

public interface DeviceMaintainService {
    PageInfo<DeviceMaintain> queryPage(int page, int rows);
}
