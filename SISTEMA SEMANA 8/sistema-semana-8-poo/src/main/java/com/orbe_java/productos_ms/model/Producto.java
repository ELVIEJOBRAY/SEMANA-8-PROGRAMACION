package com.orbe_java.productos_ms.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Del_Producto")
    private int id;

    @Column(name = "Codigo_Del_Producto", nullable = false, unique = true)
    private String codigo;

    @Column(name = "Nombre_Del_Producto", nullable = false)
    private String nombre;

    @Column(name = "Descripcion_Del_Producto")
    private String descripcion;

    @Column(name = "Precio_Base_Del_Producto", nullable = false)
    private BigDecimal precioBase;

    @Column(name = "Precio_De_Venta_Del_Producto", nullable = false)
    private BigDecimal precioVenta;

    @Column(name = "Cantidad_Disponible_Del_Producto", nullable = false)
    private int cantidadDisponible;

    @Column(name = "Id_Categoria_Del_Producto", nullable = false)
    private int idCategoria;

    // Getters y Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public BigDecimal getPrecioBase() { return precioBase; }
    public void setPrecioBase(BigDecimal precioBase) { this.precioBase = precioBase; }

    public BigDecimal getPrecioVenta() { return precioVenta; }
    public void setPrecioVenta(BigDecimal precioVenta) { this.precioVenta = precioVenta; }

    public int getCantidadDisponible() { return cantidadDisponible; }
    public void setCantidadDisponible(int cantidadDisponible) { this.cantidadDisponible = cantidadDisponible; }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }
}
