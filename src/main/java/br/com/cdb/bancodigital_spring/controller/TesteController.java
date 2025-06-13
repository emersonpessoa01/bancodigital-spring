package br.com.cdb.bancodigital_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    @GetMapping("/msg/{texto}")
    public String enviarMensagem(@PathVariable String texto) {
        return texto;
    }
}
