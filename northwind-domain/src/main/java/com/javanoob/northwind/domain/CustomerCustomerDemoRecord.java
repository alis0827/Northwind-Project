package com.javanoob.northwind.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by ruel on 3/29/15.
 */
@Entity
@Table(name="CustomerCustomerDemo", schema="northwind")
public class CustomerCustomerDemoRecord implements Serializable {

    private static final long serialVersionUID=9239472947992834L;

    @Id
    @Column(name="CustomerID")
    private String customerId;

    @Id
    @Column(name="CustomerTypeID")
    private String customerTypeId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
}

