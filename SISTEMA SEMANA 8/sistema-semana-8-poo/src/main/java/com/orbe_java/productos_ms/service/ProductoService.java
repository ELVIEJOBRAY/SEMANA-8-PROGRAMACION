package com.orbe_java.productos_ms.service;

import com.orbe_java.productos_ms.model.Producto;
import com.orbe_java.productos_ms.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Guardar un producto
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    // Listar todos los productos
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

 // Buscar producto por código
public Optional<Producto> buscarPorCodigo(String codigo) {
   return productoRepository.findByCodigo(codigo);

}

    // Actualizar un producto
    public Producto actualizar(Producto producto) {
        return productoRepository.save(producto);
    }

    // Eliminar lógico (poner cantidad en 0)
    public void eliminarLogico(int id) {
        Optional<Producto> optionalProducto = productoRepository.findById(id);
        if (optionalProducto.isPresent()) {
            Producto producto = optionalProducto.get();
            producto.setCantidadDisponible(0);
            productoRepository.save(producto);
        }
    }
}
