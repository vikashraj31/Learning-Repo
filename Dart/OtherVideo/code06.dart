// Dart Conditional Statements

void main() {

  // ---------------- If Statement ----------------
  // Executes only if the condition is true

  int age = 20;

  if (age >= 18) {
    print("You are eligible to vote.");
  }


  // ---------------- If-Else Statement ----------------
  // Executes one block if true, otherwise another block

  int marks = 35;

  if (marks >= 40) {
    print("Pass");
  } else {
    print("Fail");
  }


  // ---------------- If-Else If Statement ----------------
  // Used when multiple conditions need to be checked

  int score = 85;

  if (score >= 90) {
    print("Grade A+");
  } else if (score >= 80) {
    print("Grade A");
  } else if (score >= 70) {
    print("Grade B");
  } else if (score >= 60) {
    print("Grade C");
  } else {
    print("Fail");
  }
}