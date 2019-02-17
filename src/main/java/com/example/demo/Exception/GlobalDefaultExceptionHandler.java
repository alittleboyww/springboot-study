package com.example.demo.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    public static final String ERROR_VIEW = "error";

    @ExceptionHandler(value = RuntimeException.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e) throws Exception{
        e.printStackTrace();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception",e);
        modelAndView.addObject("url",request.getRequestURL());
        modelAndView.setViewName(ERROR_VIEW);
        return modelAndView;
    }
    /*
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("errorCode","404");
        map.put("errorMsg","找不到页面了");
        return map;
    }*/
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest request,Exception e){
        e.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler.defalutErrorHandler");
        /**
         *  返回json数据或者String数据：
         *  那么需要在方法上添加注解：@ResponseBody
         *  添加return即可
         */

        /**
         * 返回视图：
         * 定义一个ModelAndView即可，
         * 然后return即可
         *  定义视图文件（比如：error.html,error.ftl,error.jsp）
         */
    }
}
