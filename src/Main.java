import view.App;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Plane avion = new Plane(1, 2.0, 45, 250.0, PropulsionEnum.MOTOR_A_HELICE);
        //System.out.println(ObjectMapperSingleton.getInstance().writeValueAsString(avion));
        //System.out.println(ObjectMapperSingleton.getInstance().readValue(new File("resource/files/planes.json"), List.class));
        App.execute();
    }
}
