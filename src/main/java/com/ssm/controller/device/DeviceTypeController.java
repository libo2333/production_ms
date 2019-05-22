package com.ssm.controller.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.device.DeviceType;
import com.ssm.bean.TJson;
import com.ssm.service.device.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller/*restController会返回json数据*/
@RequestMapping("erp")
public class DeviceTypeController {
    /**
     * 类型的服务
     * */
    @Autowired
    DeviceTypeService deviceTypeService;
    /**
     * 分页
     * */
    @Autowired
    TJson<DeviceType> tJson;
    /**
     * 获取种类信息
     */
    @ResponseBody
    @RequestMapping("deviceType/get/{deviceTypeId}")
    public DeviceType getType(@PathVariable ("deviceTypeId") String deviceTypeId){

        DeviceType deviceType=deviceTypeService.queryBydeviceTypeId(deviceTypeId);
        return deviceType;
    }
    @ResponseBody
    @RequestMapping("deviceType/get_data")
    public List<DeviceType> get_data(){
        List<DeviceType> deviceTypes=deviceTypeService.queryAll();
        return deviceTypes;
    }
    @RequestMapping("device/deviceType")
    public String device_deviceType() {
        return "deviceType";
    }

    /**
     * 再次请求数据,渲染页面
     */
    @ResponseBody
    @RequestMapping("/deviceType/list")/*tip:同时请求erp/department/get_data部门数据*/
    public TJson deviceList_list(@RequestParam("page") int page, @RequestParam("rows") int rows) {
        PageInfo<DeviceType> deviceList = deviceTypeService.queryAllPage(page, rows);
        tJson.setRows(deviceList.getList());
        tJson.setTotal(deviceList.getList().size());
        return tJson;
    }

}
