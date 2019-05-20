package com.ssm.mapper.device;


import com.ssm.bean.device.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceTypeMapper {

    /**
     * 查询所有type
     * */
    List<DeviceType> queryAll();
    DeviceType queryJudge(String id);
    /**
     *TypeId删除
     * */
    int deleteByDeviceTypeId(String deviceTypeId);
    /**
     * 加入一条数据
     * */
    int insert(DeviceType record);
    /**
     * 设备种类编号,模糊
     * */
    List<DeviceType> queryByDeviceTypeId(String deviceTypeId);
    /**
     * 设备种类名称,模糊
     * */
    List<DeviceType> queryByDeviceTypeName(String deviceTypeName);
    /**
     * 更新
     * */
    int updateByDeviceType(DeviceType record);
}