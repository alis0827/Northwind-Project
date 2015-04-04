package com.javanoob.northwind.domain;

import javax.persistence.*;

/**
 * Created by ruel on 3/29/15.
 */
@Entity
@Table(name="Categories", schema="northwind")
public class CategoriesRecord implements Categories{

    @Id
    @GeneratedValue
    @Column(name="CategoryID")
    private Integer categoryId;

    @Column(name="CategoryName")
    private String categoryName;

    @Column(name="Desciption")
    private String description;

    @Column(name="Picture")
    private byte[] picture;

    @Override
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "CategoriesRecord{" +
                "description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
