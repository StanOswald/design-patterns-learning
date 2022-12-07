package cn.stanoswald.creational.builder.entity.builder;

import cn.stanoswald.creational.builder.entity.Car;
import cn.stanoswald.creational.builder.entity.components.*;

public class Director {
    public void constructSportsCar(GenericComponentsBuilder<?> builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(GenericComponentsBuilder<?> builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public Car constructSUV() {
        return new Car.Builder()
                .setCarType(CarType.SUV)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTripComputer(new TripComputer())
                .setTransmission(Transmission.AUTOMATIC)
                .setGPSNavigator(new GPSNavigator())
                .build();
    }



}
