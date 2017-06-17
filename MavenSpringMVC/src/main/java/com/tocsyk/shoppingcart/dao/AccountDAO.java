package com.tocsyk.shoppingcart.dao;


import com.tocsyk.shoppingcart.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO {


    public Account findAccount(String userName);

}