package com.itheima.controller;

import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author Jyz
 * @Date 2021/7/18 - 16:53
 * @Description com.itheima.controller
 * @Since version-11
 */
@Controller
public class Controller01 {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(){

        System.out.println("来了来了他来了");
        List<Account> list = accountService.findAll();
        System.out.println("list = " + list);

        return "success";
    }
}
