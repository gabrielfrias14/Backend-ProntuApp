package com.prontuapp.api.controller;

import com.prontuapp.api.model.UsuarioSistema;
import com.prontuapp.api.repository.UsuarioSistemaRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioSistemaController {

    private final UsuarioSistemaRepository repository;

    public UsuarioSistemaController(UsuarioSistemaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public UsuarioSistema criar(@RequestBody UsuarioSistema usuario) {
        return repository.save(usuario);
    }

    @GetMapping
    public List<UsuarioSistema> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioSistema> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}