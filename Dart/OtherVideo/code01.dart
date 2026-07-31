// Variables in Dart

void main() {

  // String stores text
  String name = "John";
  print(name);

  // int stores whole numbers
  int age = 22;
  print(age);

  // var automatically detects the datatype
  var x = 41;
  print(x);

  // dynamic allows datatype to change
  dynamic firstName = "Tim";
  print(firstName);

  firstName = 100;
  print(firstName);

  firstName = true;
  print(firstName);

  // const value cannot be changed
  const String fullName = "John Elder";
  print(fullName);

  // final can be assigned only once
  final String nickName = "J";
  print(nickName);

  // Variable declared without value
  var myName;
  print(myName); // Output: null

  // Assigning value later
  myName = "John";
  print(myName);

  // Changing the value
  myName = "David";
  print(myName);
}