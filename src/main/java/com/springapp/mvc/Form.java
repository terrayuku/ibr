package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "form")
public class Form {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String returnName(@RequestParam("name") String name) {
        return "Name is by : " + name;
    }
}