package com.ssm.service.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceType;

import java.util.List;

public interface DeviceTypeService {
    DeviceType queryBydeviceTypeId(String deviceTypeId);

    List<DeviceType> queryAll();

    PageInfo<DeviceType> queryAllPage(int page, int rows);
}
