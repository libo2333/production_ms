package com.ssm.controller.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceCheck;
import com.ssm.bean.TJson;
import com.ssm.service.device.DeviceCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("erp")
public class DeviceCheckController {
    @Autowired
    DeviceCheckService deviceCheckService;
    @Autowired
    TJson<DeviceCheck> deviceCheckTJson;
    @RequestMapping("device/deviceCheck")
    public String device_deviceCheck(){
        return "deviceCheck";
    }
    @ResponseBody
    @RequestMapping("deviceCheck/list")
    public TJson<DeviceCheck> deviceCheck_list(@RequestParam("page") int  page,@RequestParam("rows") int rows){
        PageInfo<DeviceCheck> deviceCheckList=deviceCheckService.queryAllDeviceCheck(page,rows);
        deviceCheckTJson.setTotal(deviceCheckList.getList().size());
        deviceCheckTJson.setRows(deviceCheckList.getList());
        return  deviceCheckTJson;
    }
}
