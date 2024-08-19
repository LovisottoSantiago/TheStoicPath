package com.stoicpath.TheStoicPath.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private StoicPhrases stoicPhrases;

    @GetMapping("/")
    public String home(Model model) {
        try {
            model.addAttribute("phrase", stoicPhrases.getRandomPhrase());
        } catch (Exception e) {
            model.addAttribute("phrase", "An error occurred while fetching the phrase.");
        }
        return "index";
    }
}
