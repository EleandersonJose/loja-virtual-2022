package com.dev.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Categoria;
import com.dev.backend.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria inserir(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria alterar(Categoria categoria) {
        return categoriaRepository.saveAndFlush(categoria);
    }

    public ResponseEntity<Void> excluir(Long id) {
        categoriaRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
