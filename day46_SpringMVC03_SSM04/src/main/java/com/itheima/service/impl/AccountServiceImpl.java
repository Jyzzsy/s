package com.itheima.service.impl;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Jyz
 * @Date 2021/7/18 - 16:57
 * @Description com.itheima.service.impl
 * @Since version-11
 */
@Service
public class AccountServiceImpl implements AccountService {

//    注入dao
    @Autowired
    private AccountDao dao;

    public List<Account> findAll() {
        return dao.findAll();
    }
}
