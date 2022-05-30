package model.avion;

import model.PropulsionEnum;

public class GoldPlane extends SilverPlane {

    private boolean wifi;

    public GoldPlane(Integer fuelCapacity, Double costByKM, Integer maxQtyPassenger, Double maxSpeed, PropulsionEnum propulsionType, boolean cateringService, boolean wifi) {
        super(fuelCapacity, costByKM, maxQtyPassenger, maxSpeed, propulsionType, cateringService);
        this.wifi = wifi;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
