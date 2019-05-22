package com.ssm.service.device.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.Device;
import com.ssm.mapper.device.DeviceMapper;
import com.ssm.service.device.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper;

    @Override
    public PageInfo<Device> queryAll(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<Device> devices = deviceMapper.queryAll();
        return new PageInfo<>(devices);
    }

    @Override
    public Device queryById(String deviceId) {
        Device device = deviceMapper.queryIfByDeviceId(deviceId);
        return device;
    }

    @Override
    public int insert(Device device) {
        Device device1 = deviceMapper.queryIfByDeviceId(device.getDeviceId());
        int i = 0;
        if (null == device1) {
            String status =deviceMapper.queryStatus(device.getDeviceStatusId());
            device.setDeviceStatus(status);
            i = deviceMapper.insertByDevice(device);
        }
        return i;
    }

    @Override
    public int update(Device device) {
        String s = deviceMapper.queryStatus(device.getDeviceStatusId());
        device.setDeviceStatus(s);
        int i = deviceMapper.updateByPrimaryKey(device);
        return i;
    }

    @Override
    public int delete(List<String> ids) {
        for (String id : ids
        ) {
            int i = deviceMapper.deleteByPrimaryKey(id);
        }
        return 1;
    }

    @Override
    public List<Device> queryAllNoPage() {

        return deviceMapper.queryAll();
    }

    @Override
    public PageInfo<Device> queryBySearchId(String key, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<Device> devices = deviceMapper.queryByDeviceId(key);
        return new PageInfo<>(devices);
    }

    @Override
    public PageInfo<Device> queryBySearchName(String key, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<Device> devices = deviceMapper.queryByDeviceName(key);
        return new PageInfo<>(devices);
    }

    @Override
    public PageInfo<Device> queryBySearchTypeName(String key, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<Device> devices = deviceMapper.queryByDeviceTypeName(key);
        return new PageInfo<>(devices);
    }
}
