package PatikaStore;

import java.util.TreeSet;

public class Telephone extends Product{


    private String color;
    private String camera;
    private String battery;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }


    public Telephone(int productBrandId, int price, String productBrandName, String productName, String memory, String screenSize, String ram,String battery,String camera,String color) {
        super(productBrandId, price, productBrandName, productName, memory, screenSize, ram);
        this.battery=battery;
        this.camera=camera;
        this.color=color;
    }
}
