package com.acorn.param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class 다양한url매핑 {
    @RequestMapping({"/login/hello.do", "/login/hi.do"})
    //@RequestMapping("/login/hello.do") // http://localhost/day1/login/hello.do
    // void인 경우에는 매핑 이름을 view 이름으로 사용한다.
    public void test1(){
        System.out.println("urlpattern=/login/hello.do");
        System.out.println("urlpattern=/login/hi.do");
    }

    @RequestMapping("/login/*")   // /login/hello, /login/hi
    public void test2(){
        System.out.println("urlpattern=/login/*");
    }

    @RequestMapping("/login/**/tmp/*.do")   // /login/bb/tmp/hi1.do, /login/aaa/tmp/hi2.do
    public void test3(){
        System.out.println("urlpattern=/login/**/tmp/*.do");
    }

    @RequestMapping("/login/??")    /* 자리수 지정 */
    public void test4(){   // /login/hi는 매칭, /login/mycar는 매칭 안 됨
        System.out.println("urlpattern=/login/??");
    }

    @RequestMapping("/*.do") // /hello.do, /hi.do, /login/hi.do
    public void test5(){
        System.out.println("urlpattern=*.do");
    }

    @RequestMapping("/*.???") // /hello.aaa, /abc.txt
    public void test6(){
        System.out.println("urlpattern=*.???");
    }
}