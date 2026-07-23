void main() {

  // If - Else

  int a = 55;

  if (a > 17) {
    print("18+");
  } else {
    print("Under 18");
  }

  // String Functions

  String b = "Hey";

  // startsWith() -> check starting characters
  // endsWith()   -> check ending characters

  if (b.startsWith("H")) {
    print("Hey");
  } else {
    print("NANANA");
  }

  // Switch Case

  int c = 10101;


//Extra feature of Switch [case 101 when No>= a:]
  switch (c) {
    case 101:
      print("No is 101");
      break;

    case 10101:
      print("No is 10101");
      break;

    default:
      print("No is Null");
  }


  
  // Initialization ; Condition ; Increment/Decrement

  for (int i = 0; i < 10; i++) {
    print("Hello $i");
  }
}