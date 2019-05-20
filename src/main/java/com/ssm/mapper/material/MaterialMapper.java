package com.ssm.mapper.material;

import com.ssm.bean.material.Material;

import java.util.List;

public interface MaterialMapper {

    List<Material> selectMaterialList();

    List<Material> searchMaterialListById(String id);

    List<Material> searchMaterialListByName(String name);

    void insertMaterial(Material material);
}
