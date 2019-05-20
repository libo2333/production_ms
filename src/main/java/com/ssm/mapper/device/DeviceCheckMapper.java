package com.ssm.mapper.device;

import com.ssm.bean.device.DeviceCheck;
import com.ssm.bean.device.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceCheckMapper {
    /**
     * 查询出所有deviceCheck
     * */
    List<DeviceCheck> queryAll();
    /**
     * 设备例检编号查例检设备
     * */
    List<DeviceCheck> queryByCheckId(String deviceCheckId);
    /**
     * 设备设备名称查例检设备
     * */
    List<DeviceCheck> queryByDeviceName(String deviceName);
    /**
     * 新增deviceCheck
     * */
    int insert(DeviceCheck record);
    /**
     * 选中的deviceCheckId删除
     * */
    int deleteByPrimaryKey(String deviceCheckId);
    /**
     * 选中的deviceCheckId更新
     * */
    int updateByPrimaryKey(DeviceCheck record);
}