package PatikaStore;

import java.util.TreeMap;
import java.util.TreeSet;

public class Brand {
    private String brandName;
    private int brandId;

    public Brand(int brandId, String brandName) {
        this.brandName = brandName;
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
}
