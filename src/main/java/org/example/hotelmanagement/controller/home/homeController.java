package org.example.hotelmanagement.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class homeController {

    @GetMapping()
    public String getHomePage(Model model) {
        model.addAttribute("fragmentContent", "homePage/fragments/contentMain :: contentMain");
        return "homePage/index";
    }
}
