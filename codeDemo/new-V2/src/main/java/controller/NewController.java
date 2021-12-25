package controller;

import model.response.NewResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.INewsService;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewController {


    private final INewsService iNewsService;

    public NewController(INewsService iNewsService) {
        this.iNewsService = iNewsService;
    }

    @GetMapping()
    public String getList(Model model){

        List<NewResponse> responses = iNewsService.getList();
        model.addAttribute("newResponse",responses);
        return "news";
    }
}
