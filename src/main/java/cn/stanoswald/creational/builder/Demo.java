package cn.stanoswald.creational.builder;

import cn.stanoswald.creational.builder.entity.Car;
import cn.stanoswald.creational.builder.entity.Manual;
import cn.stanoswald.creational.builder.entity.builder.CarBuilder;
import cn.stanoswald.creational.builder.entity.builder.CarManualBuilder;
import cn.stanoswald.creational.builder.entity.builder.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructCityCar(carBuilder);
        Car car = carBuilder.build();
        System.out.println("Car built:\n" + car);

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.build();
        System.out.println(manual.print());

        System.out.println(director.constructSUV());
    }
}
