package model.cities;

public enum City {

    BSAS("Buenos Aires"), CORDOBA("Cordoba"), ROSARIO("Rosario"), MONTEVIDEO("Montevideo"), SANTIAGO("Santiago");

    private final String name;


    City(String name) {
        this.name = name;
    }

    public String getCityName() {
        return name;
    }


}
