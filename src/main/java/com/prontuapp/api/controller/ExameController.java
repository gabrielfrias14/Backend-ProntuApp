package com.prontuapp.api.controller;

import com.prontuapp.api.model.Exame;
import com.prontuapp.api.repository.ExameRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exames")
public class ExameController {

    private final ExameRepository repository;

    public ExameController(ExameRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Exame criar(@RequestBody Exame exame) {
        return repository.save(exame);
    }

    @GetMapping
    public List<Exame> listar() {
        return repository.findAll();
    }
}