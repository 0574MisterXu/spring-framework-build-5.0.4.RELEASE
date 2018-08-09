package com.misterxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by misterxu on 2018/8/9.
 */
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "index")
    private String index(){
        return "index";
    }

}
