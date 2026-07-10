package org.example.Day21;

public class MainApp {
    static void update(int x) {
        x = 100;
    }
    public static void main(String[] args){
        int a = 10;
        //Pass by Value Example--> int/ float/ double/ String
        update(a);
        System.out.println(a);
        
        //Pass by Reference of value
        Car car=new Car("Blue","Dmodel","Big");
        //give memory address as a parameter
        passByReferenceOfValue(car);
        System.out.println(car.toString());

        //Pass by Reference of value
    }
 public static void passByReferenceOfValue(Car car)
 {
     car.color = "red";
     car.model = "GPS";
     car.engine = "Java";
     car=new Car("Blue1","Dmodel1","Big1");
     //@12345car=@12346car
 }
 public static class Car{
        String color;
        String model;
        String engine;

        public Car(String color, String model, String engine) {
            this.color = color;
            this.model = model;
            this.engine = engine;
        }
     @Override
     public String toString() {
         return "color-->"+this.color+",model-->"+this.model+",engine-->"+this.engine;

     }
    }
}
//what is the value and variable?
//value is 10,200,39.0,
//variable the space/container that can store value

//pass by value --> 10 ,200

//pass by reference --> that don't provide in java
// C++ example
//void change(int& x) {
//    x = 100;
//}
//
//int main() {
//    int a = 10;
//    change(a);
//
//    cout << a; // 100
//}

//pass by reference of value --> pass address
//--> pass the variable of memory address
