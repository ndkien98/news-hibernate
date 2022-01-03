package com.t3h.newspringboot.controller.admin;

import com.t3h.newspringboot.model.response.NewResponse;
import com.t3h.newspringboot.service.INewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cms-admin-news")
public class NewsController {

    private final INewService iNewService;

    public NewsController(INewService iNewService) {
        this.iNewService = iNewService;
    }

    @GetMapping()
    public String getList(Model model){
        List<NewResponse> newResponses = iNewService.getAll();
        model.addAttribute("news",newResponses);
        return "admin/news/list";
    }
}
