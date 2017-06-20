package com.tocsyk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addProject() {
        System.out.println("Invoking add ");
        return "project_add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String saveProject() {
        System.out.println("Invoking save ");
        return "project_add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST, params = {"type=multi"})
    public String saveMultiProject() {
        System.out.println("Invoking saveMulti ");
        return "project_add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST, params = {"type=multi","special"})
    public String saveSpecialProject() {
        System.out.println("Invoking saveSpecialMulti ");
        return "project_add";
    }

}
