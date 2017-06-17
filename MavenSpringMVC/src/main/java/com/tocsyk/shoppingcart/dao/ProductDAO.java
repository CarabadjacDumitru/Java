package com.tocsyk.shoppingcart.dao;


import com.tocsyk.shoppingcart.entity.Product;
import com.tocsyk.shoppingcart.model.PaginationResult;
import com.tocsyk.shoppingcart.model.ProductInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO {


    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code);


    public PaginationResult<ProductInfo> queryProducts(int page,
                                                       int maxResult, int maxNavigationPage);

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                                                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);

}