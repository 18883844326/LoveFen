package com.fen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FenController {
    @RequestMapping("/tt")
    public String index(){
//        return "/html/login.html";
        return "/index.html";
    }
}
