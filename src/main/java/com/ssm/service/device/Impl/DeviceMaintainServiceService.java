package com.ssm.service.device.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceMaintain;
import com.ssm.mapper.device.DeviceMaintainMapper;
import com.ssm.service.device.DeviceMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceMaintainServiceService implements DeviceMaintainService {
    @Autowired
    DeviceMaintainMapper deviceMaintainMapper;

    @Override
    public PageInfo<DeviceMaintain> queryPage(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceMaintain> deviceMaintains = deviceMaintainMapper.queryAll();
        return new PageInfo<>(deviceMaintains);
    }
}
