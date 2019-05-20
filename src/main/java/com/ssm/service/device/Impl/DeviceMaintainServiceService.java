package com.ssm.service.device.Impl;

import com.ssm.mapper.device.DeviceMaintainMapper;
import com.ssm.service.device.DeviceMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceMaintainServiceService implements DeviceMaintainService {
    @Autowired
    DeviceMaintainMapper deviceMaintainMapper;
}
