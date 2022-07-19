package bai12.view;

import bai12.model.Vehicle;
import bai12.controller.VehicleManagement;
import bai12.model.Car;
import bai12.model.Motorbike;
import bai12.model.Truck;

public class Main {
    public static void main(String[] args) {
        VehicleManagement management = new VehicleManagement();

        Vehicle car1 = new Car(1, "Honda", 20000, "red", 4, "max speed");

        Vehicle motorbike1 = new Motorbike(2,"Honda", 20000, "Blue", "max speed");

        Vehicle truck1 = new Truck(3, "Yamaha", 20000, "blue", "max speed");

        management.addVehicle(car1);
        management.addVehicle(motorbike1);
        management.addVehicle(truck1);
        management.showList();

        System.out.println("Find by manufacture Yamaha: ");
        System.out.println(management.findByManufacturer("Yamaha"));
        System.out.println("Find vehicle by color: ");
        System.out.println(management.findVehiclesByColor("blue"));

        System.out.println("Delete vehicle by id: ");
        System.out.println(management.removeById(2));
        management.showList();
    }
}
