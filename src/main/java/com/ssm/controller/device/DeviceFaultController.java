package com.ssm.controller.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceFault;
import com.ssm.bean.TJson;
import com.ssm.bean.device.DeviceMaintain;
import com.ssm.service.device.DeviceFaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("erp")
public class DeviceFaultController {
    @Autowired
    DeviceFaultService deviceFaultService;
    @Autowired
    TJson<DeviceFault> deviceFaultTJson;
    @RequestMapping("device/deviceFault")
    public String device_deviceFault(){
        return "deviceFault";
    }
    @ResponseBody
    @RequestMapping("deviceFault/get_data")
    public List<DeviceFault> deviceFault_get_date(){
        List<DeviceFault> deviceFaults=deviceFaultService.queryAll();
        return deviceFaults;
    }
    @ResponseBody
    @RequestMapping("deviceFault/list")
    public TJson<DeviceFault> deviceFault_list(@RequestParam("page") int page,
                                               @RequestParam("rows") int rows){
        PageInfo<DeviceFault> deviceFaultPageInfo=deviceFaultService.queryPage(page,rows);
        deviceFaultTJson.setRows(deviceFaultPageInfo.getList());
        deviceFaultTJson.setTotal(deviceFaultPageInfo.getList().size());
        return deviceFaultTJson;

    }
    @ResponseBody
    @RequestMapping("deviceFault/get/{deviceFaultId}")
    public DeviceFault deviceFault_get(@PathVariable("deviceFaultId") String deviceId) {
        return deviceFaultService.queryById(deviceId);
    }
}
