package com.javanoob.northwind.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by ruel on 3/29/15.
 */
@Entity
@Table(name="`Order Details`", schema="northwind")
public class OrderDetailsRecord implements OrderDetails{

    @Id
    @GeneratedValue
    @Column(name="OrderID")
    private Integer orderId;

    @Column(name="ProductID")
    private int productId;

    @Column(name="UnitPrice")
    private BigDecimal unitPrice;

    @Column(name="Quantity")
    private int quantity;

    @Column(name="Discount")
    private BigDecimal discount;

    @Override
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailsRecord{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }
}
