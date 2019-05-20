package com.ssm.mapper.device;


import com.ssm.bean.device.DeviceMaintain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMaintainMapper {
    /**
     * 查询所有
     * */
    List<DeviceMaintain> queryAll();
    /**
     * 根据维修ID删除
     * */
    int deleteByDeviceMaintainId(String deviceMaintainId);
    /**
     * 插入一条数据
     * */
    int insert(DeviceMaintain record);
    /**
     * 维修编号,模糊
     * */
    List<DeviceMaintain> queryByDeviceMainId(String deviceMaintainId);
    /**
     * 故障编号,模糊
     * */
    List<DeviceMaintain> queryByDeviceFaultId(String deviceFaultId);
    /**
     * 根据id更新
     * */
    int updateByDeviceMaintainId(DeviceMaintain record);
}