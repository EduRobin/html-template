class Vehicle {
  protected String brand = "Ford";
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {

    Car myFastCar = new Car();
    
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);


  }
}

