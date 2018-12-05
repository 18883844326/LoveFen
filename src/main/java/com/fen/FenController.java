package com.fen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FenController {
    @RequestMapping(path={"/index","/"})
    @ResponseBody
    public String lovefen(){
        return "Love Fen";
    }
}
