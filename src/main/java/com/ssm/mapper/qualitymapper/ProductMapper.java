package com.ssm.mapper.qualitymapper;

import com.ssm.bean.qualitybean.schedule.PageDetail;
import com.ssm.bean.qualitybean.schedule.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    int deleteByPrimaryKey(String productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String productId);

    List<Product> selectByPageInformation(@Param("pageDetail") PageDetail pageDetail);

    List<Product> selectByPageAndProductCondition(@Param("pageDetail") PageDetail pageDetail, @Param("condition") Map condition);

    int selectAllRecords();

    int selectAllRecordsByCondition(@Param("condition") Map condition);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectAllProducts();

    int deleteProductsByPrimaryKey(@Param("productIds") String[] ids);
}