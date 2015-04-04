package com.javanoob.northwind.dao;

import com.javanoob.northwind.domain.Products;
import com.javanoob.northwind.domain.ProductsRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ruel on 3/28/15.
 */
public interface ProductsRepository extends CrudRepository<ProductsRecord, Integer>{
}
