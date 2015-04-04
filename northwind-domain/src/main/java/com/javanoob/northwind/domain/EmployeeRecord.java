package com.javanoob.northwind.domain;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by ruel on 3/28/15.
 */
@Entity
@Table(name = "Employees", schema = "northwind")
public class EmployeeRecord implements Employee {


    @Id
    @GeneratedValue
    @Column(name="EmployeeID")
    private int employeeId;

    @Column(name="LastName")
    private String lastName;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="Title")
    private String title;

    @Column(name="TitleOfCourtesy")
    private String titleOfCourtesy;

    @Column(name="BirthDate")
    private Date birthDate;

    @Column(name="HireDate")
    private Date hireDate;

    @Column(name="Address")
    private String address;

    @Column(name="City")
    private String city;

    @Column(name="Region")
    private String region;

    @Column(name="PostalCode")
    private String postalCode;

    @Column(name="Country")
    private String country;

    @Column(name="HomePhone")
    private String homePhone;

    @Column(name="Extension")
    private String extension;

    @Column(name="Photo")
    private byte[] photo;

    @Column(name="Notes")
    private String notes;

    @Column(name="ReportsTo")
    private BigInteger reportsTo;

    @Column(name="PhotoPath")
    private String photoPath;

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
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
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public BigInteger getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(BigInteger reportsTo) {
        this.reportsTo = reportsTo;
    }

    @Override
    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "employeeId=" + employeeId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", title='" + title + '\'' +
                ", titleOfCourtesy='" + titleOfCourtesy + '\'' +
                ", birthDate=" + birthDate +
                ", hireDate=" + hireDate +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", extension='" + extension + '\'' +
                ", notes='" + notes + '\'' +
                ", reportsTo=" + reportsTo +
                ", photoPath='" + photoPath + '\'' +
                '}';
    }
}
