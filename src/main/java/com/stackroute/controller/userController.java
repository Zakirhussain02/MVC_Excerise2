package com.stackroute.controller;


import com.stackroute.configuration.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController {

//    @RequestMapping(value = "/")
//    public String greeting(ModelMap map) {
//        map.addAttribute("greeting","Welcome Zakir to stackroute");
//        return "index";
//
//    }

    @RequestMapping("/")
    public String user(ModelMap map) {
        return "index";
    }

    @RequestMapping("userinfo")
    public ModelAndView present(@RequestParam("user")String name,@RequestParam("password") String password){
        User user =new User();
        user.setPassword(password);
        user.setUsername(name);
        ModelAndView map=new ModelAndView();
        map.setViewName("main");
        map.addObject("username",user.getUsername());
        return map;
    }
}
