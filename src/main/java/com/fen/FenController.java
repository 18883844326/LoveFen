package com.fen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FenController {
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
