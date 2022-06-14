package model;


public class User {

    private String name;
    private String lastName;
    private String DNI;
    private Integer age;

    public User(String name, String lastName, String DNI, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.DNI = DNI;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName();
    }
}
