package com.ssm.service.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceFault;

import java.util.List;

public interface DeviceFaultService {
    DeviceFault queryById(String deviceId);

    List<DeviceFault> queryAll();

    PageInfo<DeviceFault> queryPage(int page, int rows);
}
