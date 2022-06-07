import mapper.ObjectMapperSingleton;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Plane avion = new Plane(1, 2.0, 45, 250.0, PropulsionEnum.MOTOR_A_HELICE);

        //System.out.println(ObjectMapperSingleton.getInstance().writeValueAsString(avion));

        System.out.println(ObjectMapperSingleton.getInstance().readValue(new File("resource/files/planes.json"), List.class));
    }
}
