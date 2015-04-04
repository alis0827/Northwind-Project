package com.javanoob.northwind.dao;

import com.javanoob.northwind.domain.EmployeeRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * Created by ruel on 3/28/15.
 */
@Repository
public interface EmpolyeeRepository extends CrudRepository<EmployeeRecord, Integer>{
}
