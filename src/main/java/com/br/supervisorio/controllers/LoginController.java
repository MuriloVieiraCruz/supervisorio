package com.br.supervisorio.controllers;

import com.br.supervisorio.entities.Login;
import com.br.supervisorio.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/login")
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/{id}")
    public ResponseEntity<Login> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(loginService.findById(id));
    }

}
