package com.ssm.controller.material;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.material.MaterialReceiveJson;
import com.ssm.bean.material.Material_receive;
import com.ssm.service.material.MaterialReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("erp/materialReceive")
public class MaterialReceiveController {

    @Autowired
    MaterialReceiveService materialReceiveService;
    @Autowired
    MaterialReceiveJson materialReceiveJson;

    /*List*/
    @RequestMapping("find")
    public String materialReceive1(){
        return "materialReceive_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public MaterialReceiveJson materialReceive2(){
        List<Material_receive> materialReceiveList = materialReceiveService.selectMaterialReceiveList();
        materialReceiveJson.setTotal(materialReceiveList.size());
        materialReceiveJson.setRows(materialReceiveList);
        return materialReceiveJson;
    }

    /*新增功能*/
    @RequestMapping("add_judge")
    public String materialReceive3(){
        return "materialReceive_add";
    }

    @RequestMapping("add")
    public String materialReceive100(){
        return "materialReceive_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public QueryStatus material101(Material_receive material_receive){
        List<Material_receive> materialReceiveList = materialReceiveService.searchMaterialReceiveListById(material_receive.getReceiveId());
        if(materialReceiveList.size() != 0){
            return new QueryStatus(100,"已存在该物料收入编号",null);
        } else{
            materialReceiveService.insertMaterialReceive(material_receive);
            return new QueryStatus(200,"新增员工成功",null);
        }
    }



    /*搜索功能*/
    @RequestMapping("search_materialReceive_by_receiveId")
    @ResponseBody
    public MaterialReceiveJson materialReceive4(String searchValue){
        List<Material_receive> materialReceiveList = materialReceiveService.searchMaterialReceiveListById(searchValue);
        materialReceiveJson.setTotal(materialReceiveList.size());
        materialReceiveJson.setRows(materialReceiveList);
        return materialReceiveJson;
    }

    @RequestMapping("search_materialReceive_by_materialId")
    @ResponseBody
    public MaterialReceiveJson materialReceive5(String searchValue) {
        List<Material_receive> materialReceiveList = materialReceiveService.searchMaterialReceiveListById2(searchValue);
        materialReceiveJson.setTotal(materialReceiveList.size());
        materialReceiveJson.setRows(materialReceiveList);
        return materialReceiveJson;
    }

}
