package com.javanoob.northwind.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by ruel on 3/28/15.
 */
@Entity
@Table(name="Products", schema="northwind")
public class ProductsRecord implements Products{

    @Id
    @GeneratedValue
    @Column(name="ProductID")
    private int productId;

    @Column(name="ProductName")
    private String productName;

    @Column(name="SupplierId")
    private int supplierId;

    @Column(name="CategoryID")
    private int categoryId;

    @Column(name="QuantityPerUnit")
    private String quantityPerUnit;

    @Column(name="UnitPrice")
    private BigDecimal money;

    @Column(name="UnitsInStock")
    private int unitsInStock;

    @Column(name="UnitsOnORder")
    private int unitsOnOrder;

    @Column(name="ReorderLevel")
    private int reorderLevel;

    @Column(name="Discontinued")
    private boolean discontinued;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    @Override
    public String toString() {
        return "ProductsRecord{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", supplierId=" + supplierId +
                ", categoryId=" + categoryId +
                ", quantityPerUnit='" + quantityPerUnit + '\'' +
                ", money=" + money +
                ", unitsInStock=" + unitsInStock +
                ", unitsOnOrder=" + unitsOnOrder +
                ", reorderLevel=" + reorderLevel +
                ", discontinued=" + discontinued +
                '}';
    }
}
