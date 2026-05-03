package org.example.assigment.lapyae.day13Pet.repository;

import org.example.assigment.lapyae.day13Pet.model.Pet;
import java.io.*;
import java.util.ArrayList;

public abstract class GenericfileRepository<P extends Pet> {

    public void saveToFile(String path, P object) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(object.toFileFormat());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public ArrayList<P> loadFromFile(String path) {
        ArrayList<P> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) return list;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(parser(line.split(",")));
            }
        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }
        return list;
    }

    public abstract P parser(String[] data);
}