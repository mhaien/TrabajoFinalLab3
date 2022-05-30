package model.avion;

import model.PropulsionEnum;

public class SilverPlane extends Plane {

    private boolean cateringService;

    public SilverPlane(Integer fuelCapacity, Double costByKM, Integer maxQtyPassenger, Double maxSpeed, PropulsionEnum propulsionType, boolean cateringService) {
        super(fuelCapacity, costByKM, maxQtyPassenger, maxSpeed, propulsionType);
        this.cateringService = cateringService;
    }

    public boolean isCateringService() {
        return cateringService;
    }

    public void setCateringService(boolean cateringService) {
        this.cateringService = cateringService;
    }
}
