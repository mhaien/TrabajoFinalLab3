package dao;

import dao.abstractdao.AbstractDao;
import model.Flight;
import model.cities.City;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FlightDao extends AbstractDao<Flight> {
    private static final String FILE_PATH = "resource/files/flight.json";

    public FlightDao() {
        super(FILE_PATH);
    }

    public List<Flight> getFlightByOriginAndDestination(City origin, City destination) throws IOException {
        return this.getDatabase().stream().filter(f -> f.getOrigin().equals(origin) && f.getDestination().equals(destination)).collect(Collectors.toList());
    }
}
