package sevenx.ui;
import sevenx.data.*;
import java.util.List;

public class DisplayVehicle {
    public static void printVehicleInfo(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("************************");
            System.out.println("Vehicle Information:-");
            System.out.println("Registration Number: " + vehicle.getRegistrationNumber());
            System.out.println("Brand: " + vehicle.getBrand());
            System.out.println("Model Name: " + vehicle.getModelName());
            System.out.println("Colour: " + vehicle.getColor());
            System.out.println("Top Speed: " + vehicle.getTopSpeed() + "kmph");
            System.out.println("Mileage: " + vehicle.getMileage() + "km");
            System.out.println("Fuel Capacity: " + vehicle.getFuelCapacity() + "L");
            System.out.println("Max Torque: " + vehicle.getMaximumTorque() + "rpm");
            System.out.println("Model Colour: " + vehicle.getColor());
            System.out.println("Number of Gears: " + vehicle.getNumberOfGears());
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Horse Power: " + car.getPower() + "hp");
                System.out.println("Transmission Type: " + car.getTransmissionType());
                System.out.println("Boot Space: " + car.getBootSpace() + "L");
                System.out.println("Number of wheels:" + car.getNumberOfWheels());
            } else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                System.out.println("Displacement: " + bike.getPower() + "cc");
                System.out.println("Brake Type: " + bike.getBrakeType());
                System.out.println("Number of wheels:" + bike.getNumberOfWheels());
            }
            System.out.println("************************");
        }
    }
}
