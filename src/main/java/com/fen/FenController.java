package com.fen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FenController {
    @RequestMapping("/ok")
//    @ResponseBody
    public String lovefen(){
        return "index";
    }
}
