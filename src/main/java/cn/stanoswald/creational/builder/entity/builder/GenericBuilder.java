package cn.stanoswald.creational.builder.entity.builder;

import cn.stanoswald.creational.builder.entity.components.*;

public interface GenericBuilder<T> {

    GenericBuilder<T> setCarType(CarType type);

    GenericBuilder<T> setSeats(int seats);

    GenericBuilder<T> setEngine(Engine engine);

    GenericBuilder<T> setTransmission(Transmission transmission);

    GenericBuilder<T> setTripComputer(TripComputer tripComputer);

    GenericBuilder<T> setGPSNavigator(GPSNavigator gpsNavigator);

    T build();
}
