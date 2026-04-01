package org.example.Day7.Inheritance;

public class Inheritance {

    public static void main(String[] args) {
       Teacher teacher = new Teacher();
       teacher.eat();
       teacher.sleep();
       teacher.professional();

       teacher.setName("Jack");
       teacher.setDegree("BCSC");
       teacher.setAge(23);
       teacher.setSubject("Java");
       teacher.setGender("Male");
       teacher.setHeight(4);

//       teacher.display();
       //Teacher --> Human
       Human human=teacher;
       human.display();
       //Teacher--> Human --> Teacher
       teacher=(Teacher) human;
       teacher.display();

       //Error Case of DownCasting
//       Human human1=new Human();
//       teacher=(Teacher) human1;
//       teacher.display();


//       Engineer engineer = new Engineer();
//       engineer.eat();
//       engineer.sleep();
//       engineer.professional();
//
//       Childern childern = new Childern();
//       childern.eat();
//       childern.sleep();
//       childern.professional();
//
//       ProgrammingTeacher programmingTeacher = new ProgrammingTeacher();
//       programmingTeacher.eat();
//       programmingTeacher.sleep();
//       programmingTeacher.professional();
    }


}
