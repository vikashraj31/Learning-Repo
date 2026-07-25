void main() {
  Car car = Car("BMW", 101);

  print(car.name);
  print(car.no);
}

class Car {
  String name;
  int no;

  Car(this.name, this.no);

  int _no2; //privet variable
}