package com.ssm.service.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.Device;

import java.util.List;

public interface DeviceService {
    PageInfo<Device> queryAll(int page, int rows);

    Device queryById(String deviceId);

    int insert(Device device);

    int update(Device device);

    int delete(List<String> ids);

    List<Device> queryAllNoPage();

    PageInfo<Device> queryBySearchId(String key, int page, int rows);

    PageInfo<Device> queryBySearchName(String key, int page, int rows);

    PageInfo<Device> queryBySearchTypeName(String key, int page, int rows);
}
