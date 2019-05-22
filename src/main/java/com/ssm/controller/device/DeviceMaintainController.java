package com.ssm.controller.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceMaintain;
import com.ssm.bean.TJson;
import com.ssm.service.device.DeviceMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("erp")
public class DeviceMaintainController {
    @Autowired
    DeviceMaintainService deviceMaintainService;
    @Autowired
    TJson<DeviceMaintain> deviceMaintainTJson;

    @RequestMapping("device/deviceMaintain")
    public String device_deviceMaintain(){
        return "deviceMaintain";
    }
    @RequestMapping("deviceMaintain/list")
    @ResponseBody
    public TJson<DeviceMaintain> deviceMaintain_list(@RequestParam("page")int page,
                                                     @RequestParam("rows")int rows){
        PageInfo<DeviceMaintain> deviceMaintainPageInfo=deviceMaintainService.queryPage(page,rows);
        deviceMaintainTJson.setTotal(deviceMaintainPageInfo.getList().size());
        deviceMaintainTJson.setRows(deviceMaintainPageInfo.getList());
        return deviceMaintainTJson;

    }

}
