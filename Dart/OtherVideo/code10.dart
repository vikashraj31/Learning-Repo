// Dart User Input with Type Conversion

import 'dart:io';

void main() {

  // Ask user to enter a number
  print("Enter a Number:");

  // Read input from keyboard
  String? num1 = stdin.readLineSync();

  // Convert String to int and add 10
  int num2 = int.parse(num1 ?? "0") + 10;

  // Display result
  print("Result: $num2");
}