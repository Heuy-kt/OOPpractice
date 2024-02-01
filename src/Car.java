import java.time.LocalDate;

public class Car{
    private String name;
    private String model;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
}
