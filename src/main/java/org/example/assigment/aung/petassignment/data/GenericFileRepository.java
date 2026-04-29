package org.example.assigment.aung.petassignment.data;

import org.example.assigment.aung.petassignment.model.Pet;
import java.io.*;
import java.util.ArrayList;


public abstract class GenericFileRepository<P extends Pet> {
    public void saveToFile(String filePath, ArrayList<P> objects) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            for(P object : objects) {
                writer.write(object.toFileFormat());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public ArrayList<P> loadFromFile(String filePath) {
        ArrayList<P> objects = new ArrayList<>();

        File file = new File(filePath);
        if (!file.exists()) {
            return objects;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                objects.add(parser(data));
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return objects;
    }
    public abstract P parser(String[] data);
}