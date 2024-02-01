import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarDealer implements iCarDealer{
    private List<Car> cars;
    private Map<Car, Double> auctions;
    public CarDealer(){
        this.cars = new ArrayList<>(List.of(
                new Car("Toyota Corolla 2006", "Toyota 2006", 260.90),
                new Car("Toyota Camry 2009", "Toyota 2009", 390.90),
                new Car("Benz1 2006", "Benz 2006", 1000.90),
                new Car("Benz2 20016", "Toyota 2006", 2000.0),
                new Car("Volvo 342", "Toyota 2006", 160.90),
                new Car("Volvo 30", gi"Volva 2013", 360.90),
                new Car(" Nissan 400", "Nissan 2001", 160.90)
        ));

        this.auctions = new HashMap<>(Map.of(
                cars.get(2), 800.90,
                cars.get(3), 1600.90
        ));
    }

    @Override
    public String sellCars(Car car, double price) {
        if(cars.contains(car) && car.getPrice() <= price){
            cars.remove(car);
            return "Bought a car from "+carDealer;
        }
        return "Car not available for that price";
    }

    @Override
    public String sellCars(Car car1, double price1, Car car2, double price2) {
        sellCars(car1, price1);
        sellCars(car2, price2);
        return "transaction occurred from "+carDealer;
    }

    @Override
    public String buyCars(Car car) {
        cars.add(car);
        return "Car bought to "+carDealer;
    }

    @Override
    public String buyCars(Car car1, Car car2) {
        buyCars(car1);
        buyCars(car2);
        return "cars bought";
    }

    @Override
    public String auctionCars() {
        String items = auctions.toString();
        return items;
    }

    public List<Car> getCars() {
        return cars;
    }
    public void printCars(){
        for(Car car : cars){
            System.out.println(car.getName());
        }
    }

    public Map<Car, Double> getAuctions() {
        return auctions;
    }
}
