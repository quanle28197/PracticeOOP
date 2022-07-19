package bai12.controller;

import bai12.model.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class VehicleManagement {
   private HashMap<Integer, Vehicle> vehicles;

   public  VehicleManagement() {
       this.vehicles = new HashMap<Integer, Vehicle>();
   }

    public HashMap<Integer, Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(HashMap<Integer, Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void showList() {
       vehicles.entrySet().stream().forEach(System.out::println);
    }

    public void addVehicle(Vehicle vehicle) {
       vehicles.put(vehicle.getId(), vehicle);
    }

    public List<Vehicle> findByManufacturer(String manufacturer) {
       return vehicles.entrySet()
               .stream()
               .map(e -> e.getValue())
               .filter(t -> t.getManufacturer().equalsIgnoreCase(manufacturer))
               .collect(Collectors.toList());
    }

    public List<Vehicle> findVehiclesByColor(String color) {
       return vehicles.entrySet()
               .stream()
               .map(e -> e.getValue())
               .filter(c -> c.getColor().equalsIgnoreCase(color))
               .collect(Collectors.toList());
    }

    public boolean removeById(Integer id) {
       Entry entry = vehicles.entrySet()
               .stream()
               .filter(t -> t.getKey() == id)
               .findFirst()
               .orElse(null);
        if (entry != null) {
            vehicles.remove(entry.getKey());
            return true;
        }
        return false;
    }
}
