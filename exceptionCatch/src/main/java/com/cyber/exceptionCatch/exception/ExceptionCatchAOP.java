package com.cyber.exceptionCatch.exception;/*************************************************  
 * @description  : [一句话描述该类的功能]  
 * @author       : [Cyber]
 * @version      : [v1.0]
 * @createTime   : [2021/6/3 8:39]   
 * @updateUser   : [Cyber]   
 * @updateTime   : [2021/6/3 8:39]   
 * @updateRemark : [说明本次修改内容]  
 *************************************************/

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 截获Controller异常
 * @author: Cyber
 * @date: 2021年06月03日 8:39
 */
@ControllerAdvice
public class ExceptionCatchAOP {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String runtimeException(){
        return "Exception!!! Here is catch global exception , like AOP";
    }
}
