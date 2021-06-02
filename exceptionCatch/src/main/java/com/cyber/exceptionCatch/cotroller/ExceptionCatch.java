package com.cyber.exceptionCatch.cotroller;/*************************************************  
 * @description  : [一句话描述该类的功能]  
 * @author       : [Cyber]
 * @version      : [v1.0]
 * @createTime   : [2021/6/2 18:54]   
 * @updateUser   : [Cyber]   
 * @updateTime   : [2021/6/2 18:54]   
 * @updateRemark : [说明本次修改内容]  
 *************************************************/

import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: Cyber
 * @date: 2021年06月02日 18:54
 */
@RestController
public class ExceptionCatch {
    try{
        int a = 2/0;
    }catch{

    }

}
