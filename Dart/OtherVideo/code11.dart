// Dart Classes

void main() {

  // Create an object
  Student student1 = Student();

  // Assign values
  student1.name = "Vikash";
  student1.age = 22;

  // Access variables
  print(student1.name);
  print(student1.age);

  // Call method
  student1.study();
}


// Class
class Student {

  // Properties (Variables)
  String? name;
  int? age;

  // Method (Function)
  void study() {
    print("$name is studying.");
  }
}