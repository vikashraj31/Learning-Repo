void main(){
  print('BRO ${Bike().no}');

  Bike().Sound(); // Calling method
  bool ans = Bike().isStarted();

  Bike B1 = Bike();
  B1.Sound();


}

class Bike{
  int no = 123;
  String name = "Java";

  void Sound(){
    print("Bika Sounds Cool");
  }

  bool isStarted(){
    return false;
  }

}