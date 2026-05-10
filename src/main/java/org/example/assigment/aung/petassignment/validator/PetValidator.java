package org.example.assigment.aung.petassignment.validator;

import org.example.assigment.aung.petassignment.annotation.EmptyField;
import org.example.assigment.aung.petassignment.annotation.NotValidAge;

import java.lang.reflect.Field;

public class PetValidator {
    public static void validate(Object object) {
        Class<?> clazz = object.getClass();
        System.out.println("class name-->" + clazz.getName());
        Field[] fields = clazz.getDeclaredFields();
        String errorMessages = null;
        StringBuilder br = new StringBuilder();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("field name-->" + field.getName());

            if (field.isAnnotationPresent(EmptyField.class)) {
                try {
                    Object value = field.get(object);
                    if (value == null || value.equals("")) {
                        EmptyField annotation = field.getAnnotation(EmptyField.class);
                        errorMessages = br.append(annotation.message()).append("\n").toString();
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Error accessing field");
                }
            }

            if (field.isAnnotationPresent(NotValidAge.class)) {
                try {
                    Number value = (Number) field.get(object);
                    if (value.doubleValue() < 0 || value.doubleValue() > 30) {
                        NotValidAge annotation = field.getAnnotation(NotValidAge.class);
                        errorMessages = br.append(annotation.message()).append("\n").toString();
                    }

                }

                catch (IllegalAccessException e) {
                    throw new RuntimeException("Error accessing field");
                }
            }
        }

        if (errorMessages != null) {
            System.out.println(errorMessages);
            throw new RuntimeException(errorMessages);
        }

    }
}
