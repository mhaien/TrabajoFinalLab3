package view;

import dao.UserDao;
import exception.SameCityException;
import model.Flight;
import model.User;
import model.cities.City;
import service.city.CityService;

import java.io.IOException;
import java.util.Scanner;

public class App {
    private static final Scanner s = new Scanner(System.in);
    private static final UserDao userDao = new UserDao();
    private static final CityService cityService = new CityService();

    public static void execute() {
        System.out.println("AEROTAXI");


        int op = 0;
        do {
            System.out.println("Ingrese opcion");
            System.out.println("1. LogIn");
            System.out.println("2. SignIn");
            System.out.println("0. SALIR");
            op = s.nextInt();
            switch (op) {
                case 1 -> logInMenu();
                case 2 -> signInMenu();
            }

        } while (op != 0);

    }


    public static void logInMenu() {
        System.out.println("LogIn Menu");

    }

    public static void signInMenu() {

        System.out.println("signIn Menu");
        String name = "";
        String lastName = "";
        String DNI = "";
        Integer age = 0;

        boolean isSaved = false;
        do {
            try {
                System.out.println("Ingrese nombre");
                name = s.nextLine();
                name = s.nextLine();
                System.out.println("Ingrese apellido");
                lastName = s.nextLine();
                System.out.println("Ingrese DNI");
                DNI = s.nextLine();
                System.out.println("Ingrese edad");
                age = s.nextInt();
                User newUser = new User(name, lastName, DNI, age);
                isSaved = userDao.saveNewUser(newUser);
                loggedUserMenu(newUser);

            } catch (IOException e) {
                System.out.println("Ocurrio un error, por favor ingrese nuevamente los datos");
                e.printStackTrace();
            }
        } while (!isSaved);
    }


    public static void loggedUserMenu(User currentUser) {
        int op;
        do {
            System.out.println(String.format("Bienvenido %s", currentUser));
            System.out.println("1. Nuevo vuelo.");
            System.out.println("0. SALIR");

            op = 0;
            op = s.nextInt();
            switch (op) {
                case 1 -> newFlightMenu(currentUser);

            }
        } while (op != 0);
    }

    public static void newFlightMenu(User currentUser) {

        System.out.println(String.format("Bienvenido %s", currentUser));
        System.out.println("--> Nuevo vuelo. <--");


        Flight flight = new Flight();
        flight.setUser(currentUser);
        City origin;
        City destination;


        boolean success = true;
        do {
            try {
                System.out.println("Ingrese ciudad de Origen");
                origin = cityService.selectCity();
                System.out.println("Ingrese ciudad de Destino");
                destination = cityService.selectCity();
                cityService.validateOriginAndDestination(origin, destination);
                flight.setOrigin(origin);
                flight.setDestination(destination);
            } catch (SameCityException e) {
                System.out.println(e.getMessage());
                System.out.println("Desea reintentar ? S/N");
                String flag = s.nextLine();
                flag = s.nextLine();
                if (flag.equalsIgnoreCase("s")) {
                    success = false;
                }
            }
        } while (!success);


    }


}
