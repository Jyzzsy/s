package com.itheima.dao;

import com.itheima.bean.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author Jyz
 * @Date 2021/7/18 - 16:57
 * @Description com.itheima.dao
 * @Since version-11
 */
public interface AccountDao {

//    使用配置文件方式
    List<Account> findAll();
}
