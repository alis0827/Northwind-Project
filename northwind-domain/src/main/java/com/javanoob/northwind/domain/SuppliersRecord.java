package com.javanoob.northwind.domain;

import javax.persistence.*;

/**
 * Created by ruel on 3/28/15.
 */
@Entity
@Table(name="Suppliers", schema="northwind")
public class SuppliersRecord implements Suppliers {
    @Id
    @GeneratedValue
    @Column(name="SupplierID")
    private int supplierId;

    @Column(name="CompanyName")
    private String companyName;

    @Column(name="ContactName")
    private String contactName;

    @Column(name="ContactTitle")
    private String contactTitle;

    @Column(name="Address")
    private String address;

    @Column(name="City")
    private String city;

    @Column(name="Region")
    private String region;

    @Column(name="PostalCode")
    private String postcalCode;

    @Column(name="Country")
    private String country;

    @Column(name="Phone")
    private String phone;

    @Column(name="Fax")
    private String fax;

    @Column(name="HomePage")
    private String homePage;

    @Override
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String getPostcalCode() {
        return postcalCode;
    }

    public void setPostcalCode(String postcalCode) {
        this.postcalCode = postcalCode;
    }

    @Override
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public String toString() {
        return "SuppliersRecord{" +
                "supplierId=" + supplierId +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactTitle='" + contactTitle + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postcalCode='" + postcalCode + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", homePage='" + homePage + '\'' +
                '}';
    }
}
