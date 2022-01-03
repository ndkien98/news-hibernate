package com.t3h.newspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping(value = {"/","index"})
    public String helloAE(Model model, @RequestParam(defaultValue = "") String name){
        model.addAttribute("name",name);
        return "admin/index";
    }

    /**
     * add template vao project
     * mac dinh thymeleaf
     * folder static: chua cac file js, css
     * template: chua cac file html
     */

}
