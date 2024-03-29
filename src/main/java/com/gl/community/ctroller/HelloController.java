package com.gl.community.ctroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public  String  hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
    @GetMapping("/hello1")
    public  String  hello1( Model model){
        Object name ="111";
        model.addAttribute("name",name);
        return "hello";
    }
}
