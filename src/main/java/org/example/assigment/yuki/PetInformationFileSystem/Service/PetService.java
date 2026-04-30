package org.example.assigment.yuki.PetInformationFileSystem.Service;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Pet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PetService {
    public void savePet(String fileName, String data) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(data + "\n");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }

    }

    public List<String> readPets(String fileName) {
        List<String> pets = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                pets.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        return pets;

    }

}
