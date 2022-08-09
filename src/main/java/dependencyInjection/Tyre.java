package dependencyInjection;

public class Tyre {
    private String brand;


    public String getBrand() {
        return brand;
    }

    public Tyre(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
