package com.ssm.mapper.material;

import com.ssm.bean.material.Material_receive;

import java.util.List;

public interface Material_receiveMapper {
   List<Material_receive> selectMaterialReceiveList();

   List<Material_receive> searchMaterialReceiveListById(String id);

   List<Material_receive> searchMaterialReceiveListById2(String id);

   void insertMaterialReceive(Material_receive material_receive);
}
