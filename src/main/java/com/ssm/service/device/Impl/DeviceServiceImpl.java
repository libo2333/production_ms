package com.ssm.service.device.Impl;

import com.ssm.bean.device.Device;
import com.ssm.mapper.device.DeviceMapper;
import com.ssm.service.device.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper
}
