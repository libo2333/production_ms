package com.ssm.controller.device;

import com.github.pagehelper.PageInfo;
import com.ssm.bean.QueryStatus;
import com.ssm.bean.device.Device;
import com.ssm.bean.TJson;
import com.ssm.service.device.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("erp")
public class DeviceController {
    /**
     * 注册一个操作数据库的类
     */
    @Autowired
    DeviceService deviceService;
    /**
     * 注册一个分页的类
     */
    @Autowired
    TJson<Device> tJson;

    /**
     * 页面跳转,并添加东西,jsp页面,视图解耦
     */
    @RequestMapping("/device/deviceList")
    public String device_deviceList() {
        return "deviceList";
    }

    /**
     * 再次请求数据,渲染页面
     */
    @ResponseBody
    @RequestMapping("/deviceList/list")/*tip:同时请求erp/department/get_data部门数据*/
    public TJson deviceList_list(@RequestParam("page") int page, @RequestParam("rows") int rows) {
        PageInfo<Device> deviceList = deviceService.queryAll(page, rows);
        tJson.setRows(deviceList.getList());
        tJson.setTotal(deviceList.getList().size());
        return tJson;
    }

    @ResponseBody
    @RequestMapping("deviceList/get/{deviceId}")
    public Device deviceList_get(@PathVariable("deviceId") String deviceId) {
        return deviceService.queryById(deviceId);
    }

    @RequestMapping("deviceList/get_data")
    @ResponseBody
    public List<Device> get_data(){
        List<Device> devices=deviceService.queryAllNoPage();
        return devices;
    }

    @RequestMapping("deviceList/add_judge")
    @ResponseBody
    public TJson deviceList_add_judge() {
        return new TJson();
    }
    @RequestMapping("deviceList/add")
    public String deviceList_add(){
        return "deviceList_add";
    }
    @ResponseBody
    @RequestMapping(value = "deviceList/insert")
    public QueryStatus deviceList_insert( Device device) {
        int i = deviceService.insert(device);
        QueryStatus queryStatus = new QueryStatus();
        if (i != 0) {
            queryStatus.setData(null);
            queryStatus.setMsg("OK");
            queryStatus.setStatus(200);
            return queryStatus;
        } else {
            queryStatus.setStatus(0);
            queryStatus.setMsg("该设备编号已经存在，请更换设备编号！");
            queryStatus.setData(null);
            return queryStatus;
        }
        /*可以再加一个异常处理器,抛出页面未知错误*/
    }

    @ResponseBody
    @RequestMapping("deviceList/edit_judge")
    public TJson deviceList_edit_judge() {
        return new TJson();
    }

    @RequestMapping("deviceList/edit")
    public String deviceList_edit() {
        return "deviceList_edit";
    }

    @RequestMapping(value = "deviceList/update")
    @ResponseBody
    public QueryStatus deviceList_update(  Device device) {
        deviceService.update(device);
        QueryStatus queryStatus = new QueryStatus();

        queryStatus.setData(null);
        queryStatus.setMsg("Ok");
        queryStatus.setStatus(200);
        return queryStatus;
    }
    @ResponseBody
    @RequestMapping("deviceList/delete_judge")
    public TJson deviceList_delete_judge(){
        return new TJson();
    }
    @ResponseBody
    @RequestMapping("deviceList/delete_batch")
    public QueryStatus deviceList_delete_batch(@RequestParam("ids") List<String> ids) {
        int i = deviceService.delete(ids);/*234,324*/
        QueryStatus queryStatus = new QueryStatus();

        queryStatus.setData(null);
        queryStatus.setMsg("Ok");
        queryStatus.setStatus(200);
        return queryStatus;
    }
    /**
     * 模糊查询开始
     * */
    @ResponseBody
    @RequestMapping("deviceList/search_device_by_deviceId")
    public TJson<Device> deviceList_serarch_device_by_deviceId(@RequestParam("searchValue")String key,
                                                               @RequestParam("page")int page,
                                                               @RequestParam("rows") int rows){
        PageInfo<Device> devicePageInfo=deviceService.queryBySearchId(key,page,rows);
        tJson.setRows(devicePageInfo.getList());
        tJson.setTotal(devicePageInfo.getList().size());
        return tJson;
    }
    @RequestMapping("deviceList/search_device_by_deviceName")
    @ResponseBody
    public TJson<Device> deviceList_search_device_by_deviceName(@RequestParam("searchValue")String key,
                                                                @RequestParam("page") int page,
                                                                @RequestParam("rows") int rows){

        PageInfo<Device> devicePageInfo=deviceService.queryBySearchName(key,page,rows);
        tJson.setRows(devicePageInfo.getList());
        tJson.setTotal(devicePageInfo.getList().size());
        return tJson;
    }
    @RequestMapping("deviceList/search_device_by_deviceTypeName")
    @ResponseBody
    public TJson<Device> deviceList_search_device_by_deviceTypeName(@RequestParam("searchValue")String key,
                                                                 @RequestParam("page") int page,
                                                                 @RequestParam("rows") int rows){

        PageInfo<Device> devicePageInfo=deviceService.queryBySearchTypeName(key,page,rows);
        tJson.setRows(devicePageInfo.getList());
        tJson.setTotal(devicePageInfo.getList().size());
        return tJson;
    }

}
