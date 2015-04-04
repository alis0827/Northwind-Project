package com.javanoob.northwind.dao;

import com.javanoob.northwind.domain.SuppliersRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ruel on 3/28/15.
 */
public interface SuppliersRepository extends CrudRepository<SuppliersRecord, Integer>{
}
