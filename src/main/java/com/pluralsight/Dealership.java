package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

// The dealership and all the cars it has
public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>(); // start with an empty lot
    }

    // ----- Getters and setters (not for inventory) -----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // ----- Searches (coming later, return null for now) -----

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    // ----- Working methods -----

    // Every car on the lot
    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    // Add a car to the lot
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // Remove a car (coming later)
    public void removeVehicle(Vehicle vehicle) {

    }
}
