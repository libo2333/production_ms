package com.ssm.service.material;

import com.ssm.bean.material.Material;

import java.util.List;

public interface MaterialService {
    List<Material> selectMaterialList();

    List<Material> searchMaterialListById(String searchValue);

    List<Material> searchMaterialListByName(String searchValue);

    void insertMaterial(Material material);
}
