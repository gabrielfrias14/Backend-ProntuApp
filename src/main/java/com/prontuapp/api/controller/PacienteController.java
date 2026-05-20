package com.prontuapp.api.controller;

import com.prontuapp.api.model.Paciente;
import com.prontuapp.api.repository.PacienteRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteRepository repository;

    public PacienteController(PacienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Paciente criar(@RequestBody Paciente paciente) {
        return repository.save(paciente);
    }

    @GetMapping
    public List<Paciente> listar() {
        return repository.findAll();
    }
}