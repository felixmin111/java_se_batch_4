package org.example.Day5;

import java.util.Scanner;

public class Immutable {
    public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("Please enter a number: ");
//       int number = scanner.nextInt();
//       scanner.nextLine();
//
//       System.out.println("Name :");
//       String name = scanner.nextLine();
//
//       System.out.println(number);
//       System.out.println(name);
//       scanner.close();

       Person personDefault = new Person();

       String[] name=new String[100];
       name[1]="Felix";

       Person[] persons = new Person[100];
       persons[0]=personDefault;


       Person person = new Person("Felix", "Dawei");
       person.setAge(900);
       person.setBalance(-100000);


        Person person1 = new Person("Toe","Yango");
        person1.setAge(40);
        person1.setBalance(30000);

        Person person2 = new Person("Zin","Mandalay");
        person2.setAge(40);
        person2.setBalance(30000);

        //instance variable
        person2.setSchoolName("ABAC");

         person.display();
         person1.display();
         person2.display();
    }

}
