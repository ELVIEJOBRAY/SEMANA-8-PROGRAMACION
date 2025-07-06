package com.orbe_java.productos_ms.repository;

import com.orbe_java.productos_ms.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Producto> findByCodigo(String codigo); // Usa el nombre del atributo de la clase
}
