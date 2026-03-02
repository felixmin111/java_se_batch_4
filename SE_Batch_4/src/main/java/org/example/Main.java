package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte smallInteger=127;
        short mediumInteger=5000;
        int standardInteger=10000;
        long largeInteger=1999999L;
        float floatingPointNumber=1.1f;
        double floatingPointNumberDouble=1.1d;
        char singleCharacter='a';
        boolean true_false=false;

        System.out.println("smallInteger="+smallInteger
                          +"\nmediumInteger="+mediumInteger
                          +"\nstandardInteger="+standardInteger
                          +"\nlargeInteger="+largeInteger
                          +"\nfloatingPointNumber="+floatingPointNumber
                          +"\nfloatingPointNumberDouble="+floatingPointNumberDouble
                          +"\nsingleCharacter="+singleCharacter
                          +"\ntrue_false="+true_false);
    }
}