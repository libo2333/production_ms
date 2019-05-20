package com.ssm.controller.unqualitycontroller;

import com.ssm.bean.QueryStatus;
import com.ssm.bean.qualitybean.QualityJson;
import com.ssm.bean.qualitybean.schedule.PageDetail;
import com.ssm.bean.qualitybean.schedule.Product;
import com.ssm.service.quailtyservice.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("erp/product")
public class ProductController {

    @Autowired
    ProductService productService;
    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("find")
    public String customList(Model model){
        return "product_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public QualityJson products(Model model, PageDetail pageDetail){

        pageDetail.setOffset((pageDetail.getPage()-1)*pageDetail.getRows());
        List<Product> products = productService.queryPageProduct(pageDetail);
        QualityJson<Product> responseVO = new QualityJson<>();

        responseVO.setRows(products);
        responseVO.setTotal(productService.queryAllProduct());
        return responseVO;
    }

    @RequestMapping("search_product_by_productId")
    @ResponseBody
    public QualityJson productsQueryById(Model model, PageDetail pageDetail, String searchValue){
        Map<String, String> condition =  new HashMap<String, String>(){{put("productId", searchValue);}};
        pageDetail.setOffset((pageDetail.getPage()-1)*pageDetail.getRows());
        List<Product> products = productService.queryPageCustomByProductId(pageDetail, condition);
        QualityJson<Product> responseVO = new QualityJson<>();
        responseVO.setRows(products);
        responseVO.setTotal(productService.queryAllRecordByProductId(condition));
        return responseVO;
    }
    @RequestMapping("search_product_by_productName")
    @ResponseBody
    public QualityJson productsQueryByName(Model model, PageDetail pageDetail, String searchValue){
        Map<String, String> condition =  new HashMap<String, String>(){{put("productName", searchValue);}};
        pageDetail.setOffset((pageDetail.getPage()-1)*pageDetail.getRows());
        List<Product> products = productService.queryPageCustomByProductName(pageDetail, condition);
        QualityJson<Product> responseVO = new QualityJson<>();
        responseVO.setRows(products);
        responseVO.setTotal(productService.queryAllRecordByProductName(condition));
        return responseVO;
    }
    @RequestMapping("search_product_by_productType")
    @ResponseBody
    public QualityJson productsQueryByType(Model model, PageDetail pageDetail, String searchValue){
        Map<String, String> condition =  new HashMap<String, String>(){{put("productType", searchValue);}};
        pageDetail.setOffset((pageDetail.getPage()-1)*pageDetail.getRows());
        List<Product> products = productService.queryPageCustomByProductType(pageDetail, condition);
        QualityJson<Product> responseVO = new QualityJson<>();
        responseVO.setRows(products);
        responseVO.setTotal(productService.queryAllRecordByProductType(condition));
        return responseVO;
    }

    @RequestMapping("add_judge")
    @ResponseBody
    public Product addJudge(){
        return new Product();
    }
    @RequestMapping("add")
    public String productAdd(){
        return "product_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public QueryStatus productInsert(Product product){
        int i = productService.insertProduct(product);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "insert fail");
        }
    }

    @RequestMapping("delete_judge")
    @ResponseBody
    public Product deleteJudge(){
        return new Product();
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public QueryStatus deleteProducts(String[] ids){
        int i = productService.deleteProducts(ids);
        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "FAIL", "delete fail");
        }
    }

    @RequestMapping("edit_judge")
    @ResponseBody
    public Product editJudge(){
        return new Product();
    }

    @RequestMapping("edit")
    public String edit(){
        return "product_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public QueryStatus updateAll(Product updateProduct){

        QueryStatus responseMessage;

        int i = productService.updateByProductId(updateProduct);

        if (i > 0) {
            return new QueryStatus(200, "OK", null);
        } else {
            return new QueryStatus(404, "fail", "update fail");
        }
    }

    @RequestMapping("get/{productId}")
    @ResponseBody
    public Product queryProductById(@PathVariable("productId") String productId){
        return productService.queryProductByProductId(productId);
    }

    @RequestMapping("get_data")
    @ResponseBody
    public List<Product> queryAllProducts(){
        return productService.queryProducts();
    }
}
