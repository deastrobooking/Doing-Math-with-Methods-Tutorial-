package Variabla.OOPINJAVA;

public class Instancefields {
    // declare instance fields here!
    String productType;
    
    // constructor method
    public Instancefields() {
      System.out.println("I am inside the constructor method.");
    }
    
    // main method
    public static void main(String[] args) {
      System.out.println("This code is inside the main method.");
      
      Instancefields lemonadeStand = new Instancefields();
      
      System.out.println(lemonadeStand);
    }
  }