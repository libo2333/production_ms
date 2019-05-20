package com.ssm.service.material.impl;


import com.ssm.bean.material.Material_receive;
import com.ssm.mapper.material.Material_receiveMapper;
import com.ssm.service.material.MaterialReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialReceiveServiceImpl implements MaterialReceiveService {

    @Autowired
    Material_receiveMapper material_receiveMapper;

    @Override
    public List<Material_receive> selectMaterialReceiveList() {
        return material_receiveMapper.selectMaterialReceiveList();
    }

    @Override
    public List<Material_receive> searchMaterialReceiveListById(String id) {
        return material_receiveMapper.searchMaterialReceiveListById(id);
    }

    @Override
    public List<Material_receive> searchMaterialReceiveListById2(String id) {
        return material_receiveMapper.searchMaterialReceiveListById2(id);
    }

    @Override
    public void insertMaterialReceive(Material_receive material_receive) {
        material_receiveMapper.insertMaterialReceive(material_receive);
    }
}
