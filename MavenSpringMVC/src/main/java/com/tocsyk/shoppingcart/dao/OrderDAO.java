package com.tocsyk.shoppingcart.dao;


import com.tocsyk.shoppingcart.model.CartInfo;
import com.tocsyk.shoppingcart.model.OrderDetailInfo;
import com.tocsyk.shoppingcart.model.OrderInfo;
import com.tocsyk.shoppingcart.model.PaginationResult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
                                                     int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}