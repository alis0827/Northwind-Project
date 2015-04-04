package com.javanoob.northwind.domain;

import java.math.BigDecimal;

/**
 * Created by ruel on 3/28/15.
 */
public interface Products {
    public int getProductId();
    public String getProductName();
    public int getSupplierId();
    public int getCategoryId();
    public String getQuantityPerUnit();
    public BigDecimal getMoney();
    public int getUnitsInStock();
    public int getUnitsOnOrder();
    public int getReorderLevel();
    public boolean isDiscontinued();
}
