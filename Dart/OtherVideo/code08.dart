// Dart User Input

import 'dart:io';

void main() {

  // Ask user to enter their name
  print("Enter Your Name:");

  // Read input from the keyboard
  String? name = stdin.readLineSync();

  // Display the entered name
  print("Hello $name");
}