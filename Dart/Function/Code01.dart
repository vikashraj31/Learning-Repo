void main(){
  PrintName();
  int a = rollNO();
  print(a);

  print(Student()); //for only get one value use $no
  print(Student().$2);

}

//Normal Function
void PrintName(){
  print("Vikash");
}

int rollNO(){
  return 21;
}


//Advance Function with can return two or more value
(int , String) Student(){
  return (2,"vikashraj");
}