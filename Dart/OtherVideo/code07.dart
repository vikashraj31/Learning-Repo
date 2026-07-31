// Dart Functions

void main() {

  // Calling all functions

  sayHello();

  greet("Vikash");

  print(add(10, 20));

  print(square(5));

  print(myFunc("John"));

  print(myFunc("John", name2: "Bill"));
}


// ---------------- Simple Function ----------------
// No parameter, No return value

void sayHello() {
  print("Hello, Welcome to Dart!");
}


// ---------------- Function with Parameter ----------------
// Takes input but returns nothing

void greet(String name) {
  print("Hello, $name");
}


// ---------------- Function with Return Value ----------------
// Takes input and returns a value

int add(int a, int b) {
  return a + b;
}


// ---------------- Arrow Function ----------------
// Short form of a function

int square(int num) => num * num;


// ---------------- Named Parameter ----------------
// name2 is optional and has a default value

String myFunc(String name1, {String name2 = "Friends"}) {
  return "Hello $name1 and $name2";
}