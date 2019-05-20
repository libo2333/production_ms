package com.ssm.service.device.Impl;

import com.ssm.mapper.device.DeviceTypeMapper;
import com.ssm.service.device.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {
    @Autowired
    DeviceTypeMapper deviceTypeMapper;
}
