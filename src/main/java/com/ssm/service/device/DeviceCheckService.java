package com.ssm.service.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceCheck;

public interface DeviceCheckService {
    PageInfo<DeviceCheck> queryAllDeviceCheck(int page, int rows);
}
