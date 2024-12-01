package com.spigrootdev.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "../../../../recources/templates/index"; // Gibt die index.html zurück, die in src/main/resources/templates gespeichert ist
    }
}
