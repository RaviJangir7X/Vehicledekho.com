package sevenx;

import java.util.*;
import sevenx.data.*;
import sevenx.ui.DisplayVehicle;

public class VehicleDekhoMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setRegistrationNumber("2346MM");
        car.setBrand("BMW");
        car.setModelName("X3");
        car.setColor("Black");
        car.setHorsePower(248);
        car.setFuelCapacity(37);
        car.setTopSpeed(170);
        car.setBootSpace(337);
        car.setMileage(27);
        car.setMaximumTorque(4500);
        car.setNumberOfGears(5);
        car.setTransmissionType("Automatic");
        //DisplayVehicle.printVehicleInfo(car);


        Bike bike = new Bike();
        bike.setRegistrationNumber("98XXX");
        bike.setBrand("Yamaha");
        bike.setModelName("YZF R15 V3 BSF");
        bike.setColor("Red");
        bike.setFuelCapacity(12);
        bike.setCc(155);
        bike.setTopSpeed(130);
        bike.setMaximumTorque(6000);
        bike.setBrakeType("Disc");
        bike.setMileage(57);
        bike.setNumberOfGears(5);

        List<Vehicle> list = new ArrayList<Vehicle>();
        list.add(car);
        list.add(bike);
        DisplayVehicle.printVehicleInfo(list);

    }
}
