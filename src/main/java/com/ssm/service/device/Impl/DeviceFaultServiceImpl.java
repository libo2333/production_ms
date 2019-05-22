package com.ssm.service.device.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceFault;
import com.ssm.mapper.device.DeviceFaultMapper;
import com.ssm.service.device.DeviceFaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceFaultServiceImpl implements DeviceFaultService {
    @Autowired
    DeviceFaultMapper deviceFaultMapper;

    @Override
    public DeviceFault queryById(String deviceId) {
        DeviceFault deviceFault=deviceFaultMapper.queryOnlyById(deviceId);
        return deviceFault;
    }

    @Override
    public List<DeviceFault> queryAll() {
        List<DeviceFault> deviceFaults = deviceFaultMapper.queryAll();
        return deviceFaults;
    }

    @Override
    public PageInfo<DeviceFault> queryPage(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceFault> deviceFaults = deviceFaultMapper.queryAll();
        return new PageInfo<>(deviceFaults);
    }
}
