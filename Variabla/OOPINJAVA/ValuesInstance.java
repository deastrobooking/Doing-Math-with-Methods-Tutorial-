package Variabla.OOPINJAVA;

public class ValuesInstance {
    // instance fields
    String productType;
    
    // constructor method
    public ValuesInstance(String product) {
      productType = product;
    }
    
    // main method
    public static void main(String[] args) {
      ValuesInstance lemonadeStand = new ValuesInstance("lemonade");
      System.out.println(lemonadeStand.productType);
      
    }
  }