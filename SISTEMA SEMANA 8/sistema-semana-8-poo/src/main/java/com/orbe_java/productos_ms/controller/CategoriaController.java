package com.orbe_java.productos_ms.controller;

import com.orbe_java.productos_ms.model.Categoria;
import com.orbe_java.productos_ms.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    // Crear nueva categoría
    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.guardar(categoria);
    }

    // Listar todas las categorías
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listar();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Optional<Categoria> buscarPorId(@PathVariable int id) {
        return categoriaService.buscarPorId(id);
    }

    // Buscar por nombre
    @GetMapping("/nombre/{nombre}")
    public Optional<Categoria> buscarPorNombre(@PathVariable String nombre) {
        return categoriaService.buscarPorNombre(nombre);
    }

    // Actualizar categoría
    @PutMapping
    public Categoria actualizarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.actualizar(categoria);
    }

    // Eliminar categoría
    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable int id) {
        categoriaService.eliminar(id);
    }
}
