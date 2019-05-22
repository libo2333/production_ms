package com.ssm.mapper.device;


import com.ssm.bean.device.DeviceFault;

import java.util.List;

public interface DeviceFaultMapper {


    /**
     * 查询出所有deviceFault
     * */
    List<DeviceFault> queryAll();

    /**
     * 插入一个deviceFault
     * */
    int insertDeviceFault(DeviceFault record);
    /**
     * 根据故障编号模糊查询数据
     * */
    List<DeviceFault> queryByDeviceFaultId(String deviceFaultId);
    /**
     * 根据设备名称模糊查询数据
     * */
    List<DeviceFault> queryByDeviceName(String deviceName);
    /**
     * 根据选中更新
     * */
    int updateByDeviceFaultID(DeviceFault record);
    /**
     * 根据选中删除
     * */
    int deleteByDeviceFaultID(String deviceFaultId);

    DeviceFault queryOnlyById(String deviceId);
}