package model.avion;

import model.PropulsionEnum;

public class Plane {

    private Integer fuelCapacity;
    private Double costByKM;
    private Integer maxQtyPassenger;
    private Double maxSpeed;
    private PropulsionEnum propulsionType;

    public Plane(Integer fuelCapacity, Double costByKM, Integer maxQtyPassenger, Double maxSpeed, PropulsionEnum propulsionType) {
        this.fuelCapacity = fuelCapacity;
        this.costByKM = costByKM;
        this.maxQtyPassenger = maxQtyPassenger;
        this.maxSpeed = maxSpeed;
        this.propulsionType = propulsionType;
    }


    public Integer getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Double getCostByKM() {
        return costByKM;
    }

    public void setCostByKM(Double costByKM) {
        this.costByKM = costByKM;
    }

    public Integer getMaxQtyPassenger() {
        return maxQtyPassenger;
    }

    public void setMaxQtyPassenger(Integer maxQtyPassenger) {
        this.maxQtyPassenger = maxQtyPassenger;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public PropulsionEnum getPropulsionType() {
        return propulsionType;
    }

    public void setPropulsionType(PropulsionEnum propulsionType) {
        this.propulsionType = propulsionType;
    }
}
