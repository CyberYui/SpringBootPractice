package com.cyber.exceptioncatchthymeleaf.cotroller;/*************************************************  
 * @description  : [捕获异常控制器]
 * @author       : [Cyber]
 * @version      : [v1.0 捕获异常]
 * @createTime   : [2021/6/15 17:08]   
 * @updateUser   : [Cyber]   
 * @updateTime   : [2021/6/15 17:08]   
 * @updateRemark : [说明本次修改内容]  
 *************************************************/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 创建两个请求地址 , 具体参照了 ExceptionCatch
 * @author: Cyber
 * @date: 2021年06月15日 17:08
 */
@RestController
public class ExceptionCatchController {

    @RequestMapping("/hello")
    public String hello(){
        // RequestMapping 申请了一个路径地址 , 我们通过访问 域名+路径 就能进入这里
        // 很简单的输出内容 , 返回一段字符串
        return "Hello Cyber ~~~";
    }

    @RequestMapping("/exception")
    public String exception(){
        int a = 10/0;
        // 正常应该在页面中显示这些内容
        return "Hello SpringBoot !";
    }
}
