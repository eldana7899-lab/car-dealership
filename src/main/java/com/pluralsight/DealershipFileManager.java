package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Reads and saves the inventory.csv file
public class DealershipFileManager {

    private static final String FILE_NAME = "inventory.csv";

    // Read the file and build the Dealership with all its cars
    // Line 1 = dealership info, every other line = one car
    public Dealership getDealership() {
        Dealership dealership = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            // Line 1: name|address|phone
            String[] info = reader.readLine().split("\\|");
            dealership = new Dealership(info[0], info[1], info[2]);

            // The rest: vin|year|make|model|type|color|odometer|price
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    continue; // skip empty lines
                }

                String[] parts = line.split("\\|");
                Vehicle vehicle = new Vehicle(
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[1]),
                        parts[2],
                        parts[3],
                        parts[4],
                        parts[5],
                        Integer.parseInt(parts[6]),
                        Double.parseDouble(parts[7])
                );
                dealership.addVehicle(vehicle);
            }

        } catch (IOException e) {
            System.out.println("Could not read " + FILE_NAME + ": " + e.getMessage());
        }

        return dealership;
    }

    // Save the dealership back to the file (coming later)
    public void saveDealership(Dealership dealership) {

    }
}
