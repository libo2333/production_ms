package com.ssm.service.material.impl;

import com.ssm.bean.material.Material;
import com.ssm.mapper.material.MaterialMapper;
import com.ssm.service.material.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialMapper materialMapper;

    @Override
    public List<Material> selectMaterialList() {
        return materialMapper.selectMaterialList();
    }

    @Override
    public List<Material> searchMaterialListById(String id) {
       List<Material> materials = materialMapper.searchMaterialListById(id);
        return materials;
    }

    @Override
    public List<Material> searchMaterialListByName(String name) {
        return materialMapper.searchMaterialListByName(name);
    }

    @Override
    public void insertMaterial(Material material) {
        materialMapper.insertMaterial(material);
    }
}
