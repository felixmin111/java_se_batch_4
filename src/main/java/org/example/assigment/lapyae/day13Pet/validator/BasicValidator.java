package org.example.assigment.lapyae.day13Pet.validator;

import org.example.assigment.lapyae.day13Pet.annotation.Required;
import org.example.assigment.lapyae.day13Pet.annotation.Checkage;
import java.lang.reflect.Field;

public class BasicValidator {
    public static void validatePet(Object obj) throws Exception {
        Class<?> currentClass = obj.getClass();

        while (currentClass != null) {
            Field[] fields = currentClass.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);

                if (field.isAnnotationPresent(Required.class)) {
                    Object value = field.get(obj);

                    if (value == null || value.toString().isEmpty()) {
                        throw new Exception("Error: " + field.getName() + " cannot be empty!");
                    }
                }

                if (field.isAnnotationPresent(org.example.assigment.lapyae.day13Pet.annotation.NoNumbers.class)) {
                    Object value = field.get(obj);
                    // Check if the string contains any digits (0-9)
                    if (value != null && value.toString().matches(".*\\d.*")) {
                        throw new Exception("Error: " + field.getName() + " cannot contain numbers!");
                    }
                }

                if (field.isAnnotationPresent(Checkage.class)) {
                    Object value = field.get(obj);
                    if (value instanceof Integer) {
                        int age = (Integer) value;
                        if (age < 0 || age > 30) {
                            throw new Exception("Error: Age must be between 0 and 30!");
                        }
                    }
                }
            }

            currentClass = currentClass.getSuperclass();
        }
    }
}