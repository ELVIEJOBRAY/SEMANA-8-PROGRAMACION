package com.orbe_java.productos_ms.service;

import com.orbe_java.productos_ms.model.Categoria;
import com.orbe_java.productos_ms.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Guardar categoría
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Listar todas las categorías
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    // Buscar por ID
    public Optional<Categoria> buscarPorId(int id) {
        return categoriaRepository.findById(id);
    }

    // Buscar por nombre
    public Optional<Categoria> buscarPorNombre(String nombre) {
        return categoriaRepository.findByNombre(nombre);
    }

    // Actualizar
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Eliminar
    public void eliminar(int id) {
        categoriaRepository.deleteById(id);
    }
}
