package com.app.product.Models.Service;

import com.app.product.Models.Entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> buscarTodosProductos();
    public Producto buscarProductoPorId(Integer id);
}
