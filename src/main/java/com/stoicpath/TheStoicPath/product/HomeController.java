package com.stoicpath.TheStoicPath.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private StoicPhrases phraseService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("phrase", phraseService.getRandomPhrase());
        return "index";
    }
}
