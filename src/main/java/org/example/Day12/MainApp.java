package org.example.Day12;

public class MainApp {


    public static void main(String[] args){

      int code=Level.ADVANCE.getCode();
      String lable=Level.ADVANCE.getLable();
      System.out.println(code);
      System.out.println(lable);

      if(Level.ADVANCE==Level.BASIC){
          System.out.println("they are the same ");
      }else{
          System.out.println("they are not the same ");
      }
    }
}
