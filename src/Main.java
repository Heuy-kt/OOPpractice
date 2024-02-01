import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer();

        Car car = carDealer.getCars().get(2);
        System.out.println(carDealer.sellCars(car, 9000.89));

        carDealer.printCars();
    }
}