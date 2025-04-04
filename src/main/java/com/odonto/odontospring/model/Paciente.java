package com.odonto.odontospring.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Tratamento> tratamentos;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Tratamento> getTratamentos() { return tratamentos; }
    public void setTratamentos(List<Tratamento> tratamentos) { this.tratamentos = tratamentos; }
}
