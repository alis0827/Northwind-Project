package com.javanoob.northwind.domain;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by ruel on 3/28/15.
 */
@Entity
@Table(name="Region", schema="northwind")
public class RegionRecord implements  Region{
    @Id
    @GeneratedValue
    @Column(name="RegionID")
    private Integer regionId;

    @Column(name="RegionDescrtion")
    private String regionDescription;

    @Override
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Override
    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

    @Override
    public String toString() {
        return "RegionRecord{" +
                "regionId=" + regionId +
                ", regionDescription='" + regionDescription + '\'' +
                '}';
    }
}
