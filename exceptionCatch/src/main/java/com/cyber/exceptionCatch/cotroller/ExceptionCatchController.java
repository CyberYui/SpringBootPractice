package com.cyber.exceptionCatch.cotroller;
/*************************************************
 * @description  : 本项目就是为了练习抓取异常而创建的,但是基本会用到SpringBoot的一些基本功能
 * @author       : [Cyber]
 * @version      : [v1.0 完成捕获异常]
 * @createTime   : [2021/6/2 18:54]
 * @updateUser   : [Cyber]
 * @updateTime   : [2021/6/2 18:54]
 * @updateRemark : [说明本次修改内容]
 *************************************************/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * 创建两个请求地址,hello 是一个简单的内容输出,
 * exception 则是创建一个 int 异常 , 然后该页面有个基本输出
 * 可以通过注释内的 try-catch 句柄抓取异常重新在页面输出内容
 * 也可以通过 exception 目录下的 AOP 去全局抓取 Controller 的异常, 然后对网页进行一个内容输出
 * RestController 和 Controller 是有区别的
 * @author: Cyber
 * @date: 2021年06月02日 18:54
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

        //try-catch 句柄
        //try{
        //    int a = 10/0; // 创建一个异常 , 除数为 0 是不被允许的
        //}catch (Exception e){
        //    // println 中的内容会展示在项目的控制台里面
        //    System.out.println("Exception alert !");
        //    // return 里面的内容会显示在页面中
        //    return "Exception alert !"
        //}

        int a = 10/0;
        // 正常应该在页面中显示这些内容
        return "Hello SpringBoot !";
    }
}
