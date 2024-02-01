//polymophisms and interfaces

import java.util.Map;

public interface iCarDealer {
    String carDealer = "Olusola Cars";
    String address = "23, Debo roads Ikeja";
    String carNumber = "+2348063211050";

    String sellCars(Car car, double price);
    String sellCars(Car car1, double price1, Car car2, double price2);
    String buyCars(Car car);
    String buyCars(Car car1, Car car2);

    String auctionCars();

}
