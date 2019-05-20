package com.ssm.service.device.Impl;

import com.ssm.bean.device.DeviceCheck;
import com.ssm.mapper.device.DeviceCheckMapper;
import com.ssm.service.device.DeviceCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceCheckServiceImpl implements DeviceCheckService {
    @Autowired
    DeviceCheckMapper deviceCheckMapper;


}
