package com.prontuapp.api.controller;

import com.prontuapp.api.model.Vacina;
import com.prontuapp.api.repository.VacinaRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    private final VacinaRepository repository;

    public VacinaController(VacinaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Vacina criar(@RequestBody Vacina vacina) {
        return repository.save(vacina);
    }

    @GetMapping
    public List<Vacina> listar() {
        return repository.findAll();
    }
}