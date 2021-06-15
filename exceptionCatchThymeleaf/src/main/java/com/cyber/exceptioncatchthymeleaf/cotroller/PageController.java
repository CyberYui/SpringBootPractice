package com.cyber.exceptioncatchthymeleaf.cotroller;/*************************************************  
 * @description  : [创建控制 thymeleaf 模板的控制类]
 * @author       : [Cyber]
 * @version      : [v1.0]
 * @createTime   : [2021/6/15 18:21]   
 * @updateUser   : [Cyber]   
 * @updateTime   : [2021/6/15 18:21]   
 * @updateRemark : [说明本次修改内容]  
 *************************************************/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: Cyber
 * @date: 2021年06月15日 18:21
 */
@RestController
public class PageController {
    @RequestMapping("/exceptionTh")
    public String hello(){
        return "here is the thymeleaf controller returns";
    }
}
