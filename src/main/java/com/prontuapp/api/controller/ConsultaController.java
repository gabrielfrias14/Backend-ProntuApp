package com.prontuapp.api.controller;

import com.prontuapp.api.model.Consulta;
import com.prontuapp.api.repository.ConsultaRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
@CrossOrigin("*")
public class ConsultaController {

    private final ConsultaRepository repository;

    public ConsultaController(ConsultaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Consulta criar(@RequestBody Consulta consulta) {
        return repository.save(consulta);
    }

    @GetMapping
    public List<Consulta> listar() {
        return repository.findAll();
    }
}