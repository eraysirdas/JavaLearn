package PatikaStore;

import java.util.HashMap;
import java.util.TreeSet;

public  class Product{

    private int price;
    private String productBrandName;
    private int productBrandId;
    //private int discountRate;
    //private int stock;
    private String productName;
    private String memory;
    private String screenSize;
    private String ram;

    public Product(int productBrandId,int price,String productBrandName, String productName, String memory, String screenSize, String ram) {
        this.productBrandId=productBrandId;
        this.price = price;
        this.productBrandName=productBrandName;
        this.productName = productName;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public String getProductBrandName() {
        return productBrandName;
    }

    public void setProductBrandName(String productBrandName) {
        this.productBrandName = productBrandName;
    }

    public int getProductBrandId() {
        return productBrandId;
    }

    public void setProductBrandId(int productBrandId) {
        this.productBrandId = productBrandId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }




}
