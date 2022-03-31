 
class Box {
  double width, height, depth;
  Box(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
  }
  double volume(){
    return width * height * depth;
  }
}
class OverloadCons {
  public static void main(String[] args) {
    //Constructor to return values to Argument
    Box mybox1 = new Box(10,20,15);
    double vol; 
    vol =mybox1.volume();
    System.out.println("Vol of Box 1 is " + vol);
    }
}