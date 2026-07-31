// Dart Class Without Initialization

void main() {

  // Create object
  Student student1 = Student();

  // Assign values later
  student1.name = "Vikash";
  student1.age = 22;

  // Display values
  student1.display();
}


// Class
class Student {

  // Properties
  String? name;
  int? age;

  // Method
  void display() {
    print("Name : $name");
    print("Age : $age");
  }
}