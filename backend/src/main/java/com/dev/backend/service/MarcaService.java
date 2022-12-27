package com.dev.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Marca;
import com.dev.backend.repository.MarcaRepository;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> buscarTodos() {
        return marcaRepository.findAll();
    }

    public Marca inserir(Marca marca) {
        return marcaRepository.save(marca);
    }

    public Marca alterar(Marca marca) {
        return marcaRepository.saveAndFlush(marca);
    }

    public ResponseEntity<Void> excluir(Long id) {
        marcaRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
