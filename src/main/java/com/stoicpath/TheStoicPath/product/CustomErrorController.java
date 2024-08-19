package com.stoicpath.TheStoicPath.product;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // You can add custom logic here, e.g., logging the error
        return "error"; // Return the name of the error page template
    }

    // Deprecated in Spring Boot 2.3, but still required in Spring Boot 3.x
    public String getErrorPath() {
        return "/error";
    }
}
