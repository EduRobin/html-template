class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("mnau mnau");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("haf haf");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  
    Animal ct = new Cat();  
    Animal dg = new Dog();  
    myAnimal.animalSound();
    ct.animalSound();
    dg.animalSound();
  }
}