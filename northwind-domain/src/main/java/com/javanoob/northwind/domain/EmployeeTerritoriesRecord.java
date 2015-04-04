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
@Table(name="EmployeeTerritories", schema="northwind")
public class EmployeeTerritoriesRecord implements EmployeeTerritories, Serializable {

    private static final long serialVersionUID=1234567800129734297L;

    @Id
    @Column(name="EmployeeID")
    private int employeeId;

    @Id
    @Column(name="TerritoryID")
    private String territoryId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }
}
