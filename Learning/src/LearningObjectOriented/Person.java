package LearningObjectOriented;
class Car {

  String color;

  public Car(String carColor) {
    color = carColor;
  }

  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }

  public static void main(String[] args){
    Car myFastCar = new Car("red");
    myFastCar.startEngine();
  }
}