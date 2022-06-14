package service.city;

import exception.SameCityException;
import model.cities.City;

import java.util.Scanner;

public class CityService {

    private static final Scanner s = new Scanner(System.in);

    public CityService() {
    }

    public Integer getDistance(City origin, City destination) {
        if ((origin.equals(City.BSAS) && destination.equals(City.CORDOBA)) && (origin.equals(City.CORDOBA) && destination.equals(City.BSAS))) {
            return 695;
        } else if ((origin.equals(City.BSAS) && destination.equals(City.SANTIAGO)) && (origin.equals(City.SANTIAGO) && destination.equals(City.BSAS))) {
            return 1400;
        } else if ((origin.equals(City.BSAS) && destination.equals(City.MONTEVIDEO)) && (origin.equals(City.MONTEVIDEO) && destination.equals(City.BSAS))) {
            return 950;
        } else if ((origin.equals(City.CORDOBA) && destination.equals(City.MONTEVIDEO)) && (origin.equals(City.MONTEVIDEO) && destination.equals(City.CORDOBA))) {
            return 1190;
        } else if ((origin.equals(City.CORDOBA) && destination.equals(City.SANTIAGO)) && (origin.equals(City.SANTIAGO) && destination.equals(City.CORDOBA))) {
            return 1050;
        } else if ((origin.equals(City.MONTEVIDEO) && destination.equals(City.SANTIAGO)) && (origin.equals(City.SANTIAGO) && destination.equals(City.MONTEVIDEO))) {
            return 2100;
        }

        return 0;
    }

    public City selectCity() {
        int op = 0;
        System.out.println("1. " + City.BSAS.getCityName());
        System.out.println("2. " + City.CORDOBA.getCityName());
        System.out.println("3. " + City.MONTEVIDEO.getCityName());
        System.out.println("4. " + City.ROSARIO.getCityName());
        System.out.println("5. " + City.SANTIAGO.getCityName());
        op = s.nextInt();

        switch (op) {
            case 1 -> {
                return City.BSAS;
            }
            case 2 -> {
                return City.CORDOBA;
            }
            case 3 -> {
                return City.MONTEVIDEO;
            }
            case 4 -> {
                return City.ROSARIO;
            }
            case 5 -> {
                return City.SANTIAGO;
            }
        }
        return null;
    }


    public void validateOriginAndDestination(final City origin, final City destination) throws SameCityException {
        if (origin.equals(destination)) {
            throw new SameCityException("Misma ciudad de origen y destino.");
        }
    }


}
