package com.stoicpath.TheStoicPath.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private StoicPhrases stoicPhrases;

    @GetMapping("/blog")
    public String home(Model model) {
        try {
            model.addAttribute("phrase", stoicPhrases.getRandomPhrase());
        } catch (Exception e) {
            model.addAttribute("phrase", "An error occurred while fetching the phrase.");
        }
        return "blog";
    }
}
