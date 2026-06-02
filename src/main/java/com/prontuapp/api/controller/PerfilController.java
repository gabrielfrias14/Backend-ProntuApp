package com.prontuapp.api.controller;

import com.prontuapp.api.model.Perfil;
import com.prontuapp.api.repository.PerfilRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfis")
@CrossOrigin("*")
public class PerfilController {

    private final PerfilRepository repository;

    public PerfilController(PerfilRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Perfil criar(@RequestBody Perfil perfil) {
        return repository.save(perfil);
    }

    @GetMapping
    public List<Perfil> listar() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}