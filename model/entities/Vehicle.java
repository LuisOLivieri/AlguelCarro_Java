package model.entities;

public class Vehicle {
    private String model;

    public Vehicle(String name) {
        this.model = name;
    }
    public Vehicle(){}
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
