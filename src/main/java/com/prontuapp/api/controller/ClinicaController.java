package com.prontuapp.api.controller;

import com.prontuapp.api.model.Clinica;
import com.prontuapp.api.repository.ClinicaRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clinicas")
@CrossOrigin("*")
public class ClinicaController {

    private final ClinicaRepository repository;

    public ClinicaController(ClinicaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Clinica criar(@RequestBody Clinica clinica) {
        return repository.save(clinica);
    }

    @GetMapping
    public List<Clinica> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Clinica> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Clinica atualizar(@PathVariable Long id,
                             @RequestBody Clinica clinicaAtualizada) {

        Clinica clinica = repository.findById(id).orElseThrow();

        clinica.setNome(clinicaAtualizada.getNome());
        clinica.setCnpj(clinicaAtualizada.getCnpj());
        clinica.setTelefone(clinicaAtualizada.getTelefone());
        clinica.setEmail(clinicaAtualizada.getEmail());
        clinica.setEndereco(clinicaAtualizada.getEndereco());

        return repository.save(clinica);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}