package model;

import model.avion.Plane;
import model.cities.City;

public class Flight {

    private City origin;
    private City destination;
    private User user;
    private Plane plane;

    public Flight() {
    }

    public Flight(City origin, City destination, User user, Plane plane) {
        this.origin = origin;
        this.destination = destination;
        this.user = user;
        this.plane = plane;
    }

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
