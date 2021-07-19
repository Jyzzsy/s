package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {

    /*
        主要是为了演示抛出异常！
     */
    @RequestMapping("/show")
    public void show(int no){
        if(no == 1){
            throw new NullPointerException("出现空指针异常了~");
        }else if(no == 2 ){
            throw new ClassCastException("出现类型转换异常了~");
        }else {
            throw new RuntimeException("出现运行时异常了~！");
        }
    }
}
