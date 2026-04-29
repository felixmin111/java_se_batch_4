package org.example.assigment.thiri.Day13.repository;

import java.io.*;
import java.util.ArrayList;

public abstract class PetGenericFileRepository<T> {


    public void saveCollectionToFile(String filePath, ArrayList<T> objects) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (T object : objects) {
                writer.write(object.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public ArrayList<T> loadFromFile(String filePath) {
        ArrayList<T> objects = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists()) {
            return objects;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0) {
                    objects.add(parser(data));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
        return objects;
    }

    public abstract T parser(String[] data);
}