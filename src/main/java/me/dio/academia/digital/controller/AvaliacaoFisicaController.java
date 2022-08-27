package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.AvaliacaoFisicaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return  service.create(form);
    }
}
