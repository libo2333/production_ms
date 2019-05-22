package com.ssm.service.device.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceCheck;
import com.ssm.mapper.device.DeviceCheckMapper;
import com.ssm.service.device.DeviceCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceCheckServiceImpl implements DeviceCheckService {
    @Autowired
    DeviceCheckMapper deviceCheckMapper;


    @Override
    public PageInfo<DeviceCheck> queryAllDeviceCheck(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceCheck> deviceChecks = deviceCheckMapper.queryAll();
        return new PageInfo<>(deviceChecks);
    }
}
