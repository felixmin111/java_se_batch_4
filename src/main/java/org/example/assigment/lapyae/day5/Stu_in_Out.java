package org.example.assigment.lapyae.day5;

import com.sun.nio.sctp.PeerAddressChangeNotification;



public class Stu_in_Out {

    public String Name;
    private int Age;
    public String Address;
    private double Amount;
    public String Email;

    public static int StuCount;
    public String StuID;
    private static String schoolName;

    public Stu_in_Out (String Name, String Email , String Address) {
        System.out.println("This student is recorded.");
        this.Name = Name;
        this.Address = Address;
        this.Email = Email;
        StuCount += 1;
        this.StuID = "Student"+StuCount;
    }
    public void setAge(int Age) {
        if (Age > 0 && Age < 200) {
            this.Age = Age;
        }
        else {
            this.Age = 0;
        }
    }
    public int getAge() {

        return this.Age;
    }
    public void setAmount(double Amount) {
        if (Amount>0) {
            this.Amount = Amount;
        }
        else {
            this.Amount = 0;
        }
    }

    public double getAmount(){
        return this.Amount;
    }

    public void output(){
        System.out.println("-----------------");
        System.out.println("Student's Name: "+ this.Name );
        System.out.println("Student's Address: " + this.Address);
        System.out.println("Student's Email: " + this.Email);
        System.out.println("Student's Age: " + getAge());
        System.out.println("Student's Amount: " + getAmount());
        System.out.println("Student Count: " + StuCount);
        System.out.println("Student's ID: " + StuID);
        System.out.println("-----------------");
    }
}
