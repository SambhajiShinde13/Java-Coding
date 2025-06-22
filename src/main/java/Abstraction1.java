abstract class Vehicle {
  abstract void race();

  abstract void brake1();

  void startEngine() {
    System.out.println("Engine Started");
  }
}

class Car extends Vehicle {
  @Override
  void race() {
    System.out.println("Car is Racing");

  }

  @Override
  void brake1() {
    System.out.println("Car is Braking");
  }
}

class Main1 {
  public static void main(String[] args) {

   
   
  }
}
