package com.itheima.exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
    这是自己定义的异常处理器
        1. 写一个类，实现接口HandlerExceptionResolver
        2. 实现方法resolveException ，用来处理异常。
        3. 注册这个异常处理器。
 */
//@ComponentScan
public class MyExceptionResolver implements HandlerExceptionResolver {

    /**
     * @param request
     * @param response
     * @param handler
     * @param ex       出现的异常对象
     * @return 出现了异常之后，可以跳转到一个异常页面上，并且可以给这个页面携带一些数据。 ModelAndView ： 模型 +  视图
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        //1. 创建ModelAndView对象
        ModelAndView mv = new ModelAndView();

        //2. 设置页面
        mv.setViewName("error");

        //3. 设置数据
        //mv.addObject("msg", ex.getMessage());


        if (ex instanceof NullPointerException) {
            mv.addObject("msg", "空：" + ex.getMessage());
        } else if (ex instanceof ClassCastException) {
            mv.addObject("msg", "转化：" + ex.getMessage());
        } else {
            mv.addObject("msg", "运行：" + ex.getMessage());
        }

        return mv;
    }
}
