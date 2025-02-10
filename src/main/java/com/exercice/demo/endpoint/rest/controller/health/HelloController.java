package com.exercice.demo.endpoint.rest.controller.health;

import com.exercice.demo.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello-world-std22058";
    }
}