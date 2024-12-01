package com.spigrootdev.cg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CgController {

    @GetMapping("/cg")
    public String sayHello() {
        return "Hello from CgController"; // Gibt eine einfache Textantwort zurück
    }
}
