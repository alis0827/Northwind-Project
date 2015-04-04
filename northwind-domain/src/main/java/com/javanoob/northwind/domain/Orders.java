package com.javanoob.northwind.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ruel on 3/28/15.
 */
public interface Orders {
    public Integer getOrderId();
    public String getCustomerId();
    public int getEmployeeId();
    public Date getOrderDate();
    public Date getRequiredDate();
    public Date getShippedDate();
    public int getShipVia();
    public BigDecimal getFreight();
    public String getShipName();
    public String getShipAddress();
    public String getShipCity();
    public String getShipRegion();
    public String getShipPostalCode();
    public String getShipCountry();
}
