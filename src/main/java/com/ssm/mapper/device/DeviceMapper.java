package com.ssm.mapper.device;


import com.ssm.bean.device.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {
    /**
     * 查询出所有device
     * */
    List<Device> queryAll();
    /**
     * 设备编号模糊查询设备
     * */
    List<Device> queryByDeviceId(String id);
    /**
     * 设备名称模糊查询设备
     * */
    List<Device> queryByDeviceName(String name);
    /**
     * 根据设备种类名称查询设备
     * */
    List<Device> queryByDeviceTypeName(String type);
    /**
     * 新增和更新前和删除前,查询id
     * */
    Device queryIfByDeviceId(String id);
    /**
     * 插入一个device
     * */
    int insertByDevice( Device record);
    /**
     * 根据选中deviceId 更新
     * */
    int updateByPrimaryKey(@Param("up") Device record);
    /**
     * 根据选中devictId删除
     * */
    int deleteByPrimaryKey(@Param("del") Device record);
}