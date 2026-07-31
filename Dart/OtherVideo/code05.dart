// Dart Loops

void main() {

  // ---------------- For Loop ----------------
  // Used when the number of iterations is known

  print("For Loop:");

  for (int i = 1; i <= 5; i++) {
    print(i);
  }


  // ---------------- For-In Loop ----------------
  // Used to iterate through a List

  print("\nFor-In Loop:");

  List<String> names = ["John", "Tim", "Mary"];

  for (String name in names) {
    print(name);
  }


  // ---------------- While Loop ----------------
  // Runs until the condition becomes false

  print("\nWhile Loop:");

  int x = 1;

  while (x <= 5) {
    print(x);
    x++;
  }


  // ---------------- Do-While Loop ----------------
  // Executes at least once before checking the condition

  print("\nDo-While Loop:");

  int y = 1;

  do {
    print(y);
    y++;
  } while (y <= 5);
}