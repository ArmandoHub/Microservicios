package com.app.product.Controller;

import com.app.product.Models.Entity.Producto;
import com.app.product.Models.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listarProductos(){
        return productoService.buscarTodosProductos();
    }

    @GetMapping("/listarPorId/{id}")
    public Producto listarPorId(@PathVariable Integer id){
        return productoService.buscarProductoPorId(id);
    }
}
