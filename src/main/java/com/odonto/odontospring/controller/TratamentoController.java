package com.odonto.odontospring.controller;

import com.odonto.odontospring.model.Tratamento;
import com.odonto.odontospring.repository.TratamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tratamentos")
@CrossOrigin(origins = "*")
public class TratamentoController {

    @Autowired
    private TratamentoRepository tratamentoRepository;

    @GetMapping
    public List<Tratamento> listar() {
        return tratamentoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tratamento buscarPorId(@PathVariable Long id) {
        return tratamentoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Tratamento criar(@RequestBody Tratamento tratamento) {
        return tratamentoRepository.save(tratamento);
    }

    @PutMapping("/{id}")
    public Tratamento atualizar(@PathVariable Long id, @RequestBody Tratamento tAtualizado) {
        return tratamentoRepository.findById(id).map(t -> {
            t.setDescricao(tAtualizado.getDescricao());
            t.setPaciente(tAtualizado.getPaciente());
            return tratamentoRepository.save(t);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tratamentoRepository.deleteById(id);
    }
}
