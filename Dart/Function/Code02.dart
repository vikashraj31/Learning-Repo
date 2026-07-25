void main() {

  // Value to function
  StuInfo(name: "Vikash", roll: 21);

  // Calling again
  StuInfo(name: "Rahul", roll: 10, room: 101);  

  student("ABC College", name: "Vikash", roll: 21);
}

// required means this value must be provided
void StuInfo({required int roll, required String name,int? room,}) {
  print(name);
  print(roll);
  print(room);
}

void student(String college, {required String name, required int roll}) {
  print(college);
  print(name);
  print(roll);
}