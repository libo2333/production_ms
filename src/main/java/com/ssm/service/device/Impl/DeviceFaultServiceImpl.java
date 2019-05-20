package com.ssm.service.device.Impl;

import com.ssm.mapper.device.DeviceFaultMapper;
import com.ssm.service.device.DeviceFaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceFaultServiceImpl implements DeviceFaultService {
    @Autowired
    DeviceFaultMapper deviceFaultMapper;
}
