package cn.stanoswald.creational.builder.entity.builder;

import cn.stanoswald.creational.builder.entity.components.*;

public interface GenericComponentsBuilder<T> {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

    T build();
}
