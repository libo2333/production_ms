package com.ssm.service.material;

import com.ssm.bean.material.Material_receive;

import java.util.List;

public interface MaterialReceiveService {
    List<Material_receive> selectMaterialReceiveList();

    List<Material_receive> searchMaterialReceiveListById(String searchValue);

    List<Material_receive> searchMaterialReceiveListById2(String searchValue);

    void insertMaterialReceive(Material_receive material_receive);
}
