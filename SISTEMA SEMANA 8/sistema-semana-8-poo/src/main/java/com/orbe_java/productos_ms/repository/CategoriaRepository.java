package com.orbe_java.productos_ms.repository;

import com.orbe_java.productos_ms.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    Optional<Categoria> findByNombre(String nombre); // Búsqueda por nombre
}
