package com.ssm.service.quailtyservice;

import com.ssm.bean.qualitybean.schedule.PageDetail;
import com.ssm.bean.qualitybean.schedule.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> queryPageProduct(PageDetail pageDetail);
    int queryAllProduct();
/*    int queryAllRecordByCustomId(String searchValue);
    int queryAllRecordBycustomName(String searchValue);*/
    int insertProduct(Product product);
    int deleteProduct(String productId);
    int updateByProductId(Product product);
    List<Product> queryPageCustomByProductId(PageDetail pageDetail, Map<String, String> condition);
    int queryAllRecordByProductId(Map<String, String> productId);
    List<Product> queryPageCustomByProductName(PageDetail pageDetail, Map<String, String> condition);
    int queryAllRecordByProductName(Map<String, String> productId);
    List<Product> queryPageCustomByProductType(PageDetail pageDetail, Map<String, String> condition);
    int queryAllRecordByProductType(Map<String, String> productId);


    Product queryProductByProductId(String productId);

    List<Product> queryProducts();

    int deleteProducts(String[] ids);

}
