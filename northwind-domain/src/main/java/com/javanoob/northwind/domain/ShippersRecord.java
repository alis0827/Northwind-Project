package com.javanoob.northwind.domain;

import javax.persistence.*;

/**
 * Created by ruel on 3/29/15.
 */
@Entity
@Table(name="Shippers", schema="northwind")
public class ShippersRecord implements Shippers{

    @Id
    @GeneratedValue
    @Column(name="ShipperID")
    private Integer shipperId;

    @Column(name="CompanyName")
    private String companyName;

    @Column(name="Phone")
    private String phone;

    @Override
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    @Override
    public String toString() {
        return "ShippersRecord{" +
                "companyName='" + companyName + '\'' +
                ", shipperId=" + shipperId +
                ", phone='" + phone + '\'' +
                '}';
    }
}
