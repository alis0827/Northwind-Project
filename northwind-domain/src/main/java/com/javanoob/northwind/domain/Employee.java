package com.javanoob.northwind.domain;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by ruel on 3/28/15.
 */
public interface Employee {

    public int getEmployeeId();
    public String getLastName();
    public String getFirstName();
    public String getTitle();
    public String getTitleOfCourtesy();
    public Date getBirthDate();
    public Date getHireDate();
    public String getAddress();
    public String getCity();
    public String getRegion();
    public String getPostalCode();
    public String getCountry();
    public String getHomePhone();
    public String getExtension();
    public byte[] getPhoto();
    public String getNotes();
    public BigInteger getReportsTo();
    public String getPhotoPath();
}
