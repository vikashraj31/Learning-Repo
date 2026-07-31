import 'package:flutter/material.dart';

void main() {
  // App starts from here.
  runApp(const MyApp());
}

// Types of Widgets:
// 1. StatelessWidget -> State cannot change.
// 2. StatefulWidget -> State can change using setState().
// 3. InheritedWidget -> Used to share data across multiple widgets.

// Types of App Design:
// Material Design -> Used for Android apps.
// Cupertino Design -> Used for iOS apps.

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    // MaterialApp is the root widget of a Material Design app.
    return MaterialApp(
      home: Scaffold(
        // Scaffold provides the basic layout of the screen.
        body: Center(
          // Center widget places its child at the center of the screen.
          child: Text("Hellow Vikash"),
        ),
      ),
    );
  }
}