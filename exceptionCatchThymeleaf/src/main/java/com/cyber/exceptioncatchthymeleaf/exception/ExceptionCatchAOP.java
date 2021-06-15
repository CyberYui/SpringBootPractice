package com.cyber.exceptioncatchthymeleaf.exception;/*************************************************  
 * @description  : [一句话描述该类的功能]  
 * @author       : [Cyber]
 * @version      : [v1.0]
 * @createTime   : [2021/6/15 17:08]   
 * @updateUser   : [Cyber]   
 * @updateTime   : [2021/6/15 17:08]   
 * @updateRemark : [说明本次修改内容]  
 *************************************************/

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO
 * @author: Cyber
 * @date: 2021年06月15日 17:08
 */
@ControllerAdvice
public class ExceptionCatchAOP {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String runtimeException(){
        return "Exception!!! Here is catch global exception , like AOP";
    }
}
