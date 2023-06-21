package com.app.product.Models.Service;

import com.app.product.Models.Dao.IProductoDao;
import com.app.product.Models.Entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImp implements IProductoService{

    @Autowired
    private IProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> buscarTodosProductos() {
        return productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto buscarProductoPorId(Integer id) {
        return productoDao.findById(id).orElse(null);
    }
}
