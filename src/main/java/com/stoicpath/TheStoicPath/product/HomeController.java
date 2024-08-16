package com.stoicpath.TheStoicPath.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "index.html"; // Asegúrate de que el archivo esté en la carpeta static
    }
}
