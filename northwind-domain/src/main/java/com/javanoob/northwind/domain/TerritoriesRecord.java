package com.javanoob.northwind.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ruel on 3/29/15.
 */
@Entity
@Table(name="Territories", schema="northwind")
public class TerritoriesRecord implements Territories{

    @Id
    @Column(name="TerritoryID")
    private String territoryId;

    @Column(name="TerritoryDescription")
    private String territoryDescription;

    @Column(name="RegionID")
    private int regionId;

    @Override
    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    @Override
    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    @Override
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "TerritoriesRecord{" +
                "territoryId='" + territoryId + '\'' +
                ", territoryDescription='" + territoryDescription + '\'' +
                ", regionId=" + regionId +
                '}';
    }
}
