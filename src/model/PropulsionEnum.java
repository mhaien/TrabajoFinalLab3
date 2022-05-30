package model;

public enum PropulsionEnum {
    MOTOR_A_REACCION("Motor a reaccion"), MOTOR_A_HELICE("Motor a helice"), MOTOR_DE_PISTONES("Motor de Pistones");

    private final String msg;

    PropulsionEnum(String msg) {
        this.msg = msg;
    }
}
