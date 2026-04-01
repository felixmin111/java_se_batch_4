package org.example.Day7.Inheritance;

public class Teacher extends Human {
    private String Degree;
    private String subject;

    @Override
    public void professional(){
        System.out.println("Teacher professional");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Teacher " + getSubject());
        System.out.println("Degree " + getDegree());
    }

}
