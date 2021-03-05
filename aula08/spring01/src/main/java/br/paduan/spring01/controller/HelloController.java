package br.paduan.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> ola() {
        return ResponseEntity.ok("Olá mundo!");
    }

    @PostMapping("/hello")
    public ResponseEntity<String> ola2() {
        return ResponseEntity.ok("Olá mundo via POST!");
    }
}
