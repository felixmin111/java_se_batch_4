package org.example.assigment.thiri.Day20.validator;

import org.example.assigment.thiri.Day20.annotation.NonNegativeField;
import org.example.assigment.thiri.Day20.annotation.NotNullField;

import java.lang.reflect.Field;

public class NullValidator {
    public static void validate(Object object){
        Class<?> clazz = object.getClass();
        System.out.println("class name-->"+clazz.getName());
        Field[] fields = clazz.getDeclaredFields();
        String errorMessages=null;
        StringBuilder br=new StringBuilder();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("field name-->"+field.getName());

            if(field.isAnnotationPresent(NotNullField.class)){
                try {
                   Object value =field.get(object);
                   if(value == null || value.equals("")){
                       NotNullField annotation = field.getAnnotation(NotNullField.class);
                       errorMessages=br.append(annotation.message()).append("\n").toString();
                   }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot access this filed");
                }
            }

            if(field.isAnnotationPresent(NonNegativeField.class)){
                try {
                    Number value =(Number) field.get(object);
                    if(value.doubleValue()<0){
                        NonNegativeField annotation = field.getAnnotation(NonNegativeField.class);
                        errorMessages=br.append(annotation.message()).append("\n").toString();
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot access this filed");
                }
            }
        }
        if(errorMessages!=null){
            System.out.println(errorMessages);
            throw new RuntimeException(errorMessages);
        }
    }
}
