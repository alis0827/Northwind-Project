package com.javanoob.northwind.dao;

import com.javanoob.northwind.domain.OrderDetailsRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ruel on 3/29/15.
 */
public interface OrderDetailsRepository extends CrudRepository<OrderDetailsRecord, Integer>{
}
