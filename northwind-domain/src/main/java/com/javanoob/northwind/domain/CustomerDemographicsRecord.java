package com.javanoob.northwind.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ruel on 3/29/15.
 */
@Entity
@Table(name="CustomerDemographics", schema="northwind")
public class CustomerDemographicsRecord {

    @Id
    @Column(name="CustomerTypeID")
    private String customerTypeId;

    @Column(name="CustomerDesc")
    private String customerDesc;

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
}
