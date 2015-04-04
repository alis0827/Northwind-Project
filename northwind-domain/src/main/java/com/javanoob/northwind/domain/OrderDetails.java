package com.javanoob.northwind.domain;

import java.math.BigDecimal;

/**
 * Created by ruel on 3/29/15.
 */
public interface OrderDetails {

    public Integer getOrderId();
    public int getProductId();
    public BigDecimal getUnitPrice();
    public int getQuantity();
    public BigDecimal getDiscount();
}
