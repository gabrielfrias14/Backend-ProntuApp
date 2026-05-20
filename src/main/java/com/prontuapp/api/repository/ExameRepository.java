package com.prontuapp.api.repository;

import com.prontuapp.api.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExameRepository extends JpaRepository<Exame, Long> {
}