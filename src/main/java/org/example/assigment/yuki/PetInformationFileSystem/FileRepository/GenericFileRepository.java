package org.example.assigment.yuki.PetInformationFileSystem.FileRepository;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Pet;
import java.io.*;
import java.util.ArrayList;
import java.io.*;

public abstract class GenericFileRepository<T> {
    public void saveToFile(String filePath, T[] objects){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));) {
            for(T object : objects){
//                writer.write(object.toString());
                writer.write(((Pet) object).toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<T> loadFromFile(String filePath){
        ArrayList<T> objects = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            String line;
            int i = 0;
            while((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                objects.add(parser(data));
                i++;
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return objects;
    }
    public abstract T parser(String[] data);
}
