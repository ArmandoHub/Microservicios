package com.app.product.Models.Dao;

import com.app.product.Models.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDao extends JpaRepository<Producto,Integer> {

}
