package com.spigrootdev.cg; // Ersetze mit deinem eigenen Package-Namen

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    // Ein einfaches Endpoint, das eine Nachricht zurückgibt
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    // Ein Beispiel für eine POST-Anfrage
    @PostMapping("/api/message")
    public String postMessage(@RequestBody String message) {
        return "Received message: " + message;
    }
}
