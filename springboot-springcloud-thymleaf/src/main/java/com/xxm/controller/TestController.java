package com.xxm.controller;

import com.xxm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * 描述
 *
 * @author Mr Liu
 * @version 1.0
 * @package com.xxm.controller *
 * @Date 2019-11-29
 * @since 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String showIndex(Model model){
        //存入单值
        model.addAttribute("hello","！");
        //存入list集合
        List<User> users=new ArrayList<User>();
        users.add(new User(1,"刘德华","深圳"));
        users.add(new User(2,"周杰伦","广州"));
        users.add(new User(3,"李易峰","lijiang"));
        //存入map集合
        model.addAttribute("users",users);
        Map<String,Object> map=new HashMap<>();
        map.put("滑翔","嘿嘿嘿");
        map.put("热浪",666);
        model.addAttribute("maps",map);
        //存入数组
        String [] names={"掌上明珠","海底之王","天空之城","岁月之主"};
        model.addAttribute("names",names);
        //存入时间
        model.addAttribute("now",new Date());
        //if条件
        model.addAttribute("age",22);
        //内嵌javascript
        model.addAttribute("hello1","孤所到之处皆为尘土");
        model.addAttribute("class1","此土为欢乐土");
        model.addAttribute("class2","此土为忘忧土");
        return "demo1";
    }
}
