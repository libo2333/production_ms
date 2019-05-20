package com.ssm.controller.material;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.material.Material;
import com.ssm.bean.material.MaterialJson;
import com.ssm.service.material.MaterialService;
import com.ssm.service.person.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/erp/material")
public class MaterialController {

    @Autowired
    MaterialService materialService;
    @Autowired
    MaterialJson materialJson;


    /*List*/
    @RequestMapping("find")
    public String material1(){
        return "material_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public MaterialJson material2(int page, int rows){
        List<Material> materials = materialService.selectMaterialList();
        List<Material> materials1 = materials.subList((page-1) * rows, ((page) * rows)>=materials.size()?materials.size():((page)*rows));
        materialJson.setTotal(materials.size());
        materialJson.setRows(materials1);
        return materialJson;
    }

    /*搜索功能*/
    @RequestMapping("search_material_by_materialId")
    @ResponseBody
    public MaterialJson material3(String searchValue){
        List<Material> departments = materialService.searchMaterialListById(searchValue);
        materialJson.setTotal(departments.size());
        materialJson.setRows(departments);
        return  materialJson;
    }

    @RequestMapping("search_material_by_materialType")
    @ResponseBody
    public MaterialJson material4(String searchValue){
        List<Material> materials = materialService.searchMaterialListByName(searchValue);
        materialJson.setTotal(materials.size());
        materialJson.setRows(materials);
        return materialJson;
    }


    /*新增功能*/
    @RequestMapping("add_judge")
    public String material5(){
        return "material_add";
    }

    @RequestMapping("add")
    public String material6(){
        return "material_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public QueryStatus material7(Material material){

        List<Material> materials = materialService.searchMaterialListById(material.getMaterialId());
        //重复则提示该部门已存在
        if(materials.size() == 0){
            materialService.insertMaterial(material);
            QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
            return queryStatus;
        }else{
            return new QueryStatus(100,"该物料已存在","1");
        }
    }

    /*删除功能*/
    @RequestMapping("delete_judge")
    @ResponseBody
    public String material8(){
        return "material_list";
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public QueryStatus material9(String ids){
        materialService.deleteMaterialById(ids);
        QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
        return queryStatus;
    }

    /*编辑功能*/
    @RequestMapping("edit_judge")
    public String material10(){
        return "material_edit";
    }

    @RequestMapping("edit")
    public String material11(){
        return "material_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public QueryStatus material12(Material material){
        materialService.editMaterial(material);
        QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
        return queryStatus;
    }

    /*update_note*/
    @RequestMapping("update_note")
    @ResponseBody
    public QueryStatus material13(String materialId,String note){
        materialService.updateNoteById(materialId,note);
        QueryStatus queryStatus = new QueryStatus(200, "成功", "1");
        return queryStatus;
    }

    /*get_data*/
    @RequestMapping("get_data")
    @ResponseBody
    public List<Material> material14(){
        List<Material> materials = materialService.selectMaterialList();
        return materials;
    }

}
