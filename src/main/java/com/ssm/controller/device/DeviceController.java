package com.ssm.controller.device;

import com.ssm.bean.device.TJson;
import com.ssm.service.device.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("erp")
public class DeviceController {
    /**
     * 注册一个分页的json
     */
    @Autowired
    DeviceService deviceService;
    @Autowired
    TJson tJson;
    @ResponseBody
    @RequestMapping("/deviceList/list")
    public TJson deviceList_list(@R){

    }
}
