package com.javanoob.northwind.dao;

import com.javanoob.northwind.domain.CustomersRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ruel on 3/29/15.
 */
public interface CustomersRepository extends CrudRepository<CustomersRecord, String> {
}
