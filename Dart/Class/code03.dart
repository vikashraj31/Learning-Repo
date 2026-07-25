void main() {
  Car car = Car();

  car.start();
}

class Vehicle {
  void start() {
    print("Vehicle started");
  }
}

class Car extends Vehicle {
  void drive() {
    print("Car is driving");
  }
}