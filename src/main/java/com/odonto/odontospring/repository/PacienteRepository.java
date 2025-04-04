package com.odonto.odontospring.repository;

import com.odonto.odontospring.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
