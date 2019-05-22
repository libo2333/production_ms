package com.ssm.service.device.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceType;
import com.ssm.mapper.device.DeviceTypeMapper;
import com.ssm.service.device.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {
    @Autowired
    DeviceTypeMapper deviceTypeMapper;

    @Override
    public DeviceType queryBydeviceTypeId(String deviceTypeId) {
        DeviceType deviceType=deviceTypeMapper.queryByDeviceTypeIdAccurant(deviceTypeId);
        return  deviceType;
    }

    @Override
    public List<DeviceType> queryAll() {
        List<DeviceType> deviceTypes = deviceTypeMapper.queryAll();
        return deviceTypes;
    }

    @Override
    public PageInfo<DeviceType> queryAllPage(int page, int rows) {
        PageHelper.startPage(page, rows) ;
        List<DeviceType> deviceTypes = deviceTypeMapper.queryAll();
        return new PageInfo<>(deviceTypes);
    }
}
