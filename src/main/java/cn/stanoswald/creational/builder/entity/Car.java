package cn.stanoswald.creational.builder.entity;

import cn.stanoswald.creational.builder.entity.builder.GenericBuilder;
import cn.stanoswald.creational.builder.entity.components.*;

public class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car() {
    }

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                ", fuel=" + fuel +
                '}';
    }

    public static class Builder implements GenericBuilder<Car> {

        private final Car car = new Car();

        @Override
        public GenericBuilder<Car> setCarType(CarType type) {
            car.setCarType(type);
            return this;
        }

        @Override
        public GenericBuilder<Car> setSeats(int seats) {
            car.setSeats(seats);
            return this;
        }

        @Override
        public GenericBuilder<Car> setEngine(Engine engine) {
            car.setEngine(engine);
            return this;
        }

        @Override
        public GenericBuilder<Car> setTransmission(Transmission transmission) {
            car.setTransmission(transmission);
            return this;
        }

        @Override
        public GenericBuilder<Car> setTripComputer(TripComputer tripComputer) {
            car.setTripComputer(tripComputer);
            return this;
        }

        @Override
        public GenericBuilder<Car> setGPSNavigator(GPSNavigator gpsNavigator) {
            car.setGpsNavigator(gpsNavigator);
            return this;
        }

        @Override
        public Car build() {
            return car;
        }
    }
}
