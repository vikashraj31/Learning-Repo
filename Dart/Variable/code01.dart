void main() {
  int a = 5;
  int b = 6;

  print(a * a);
  print(a * b);

  bool ans = false;
  print(ans);

  String c = "abs";
  print(a.isOdd);
  print(c.length);

  // String Add
  String str1 = "Hello";
  String str2 = "World";

  str1 = '$str1 $str2'; // store one string into another
  print(str1);

  str2 = '${str1.length} $str1'; // this use for special case (length, method, calculation, etc.)
  print(str2);

  print('Hello\nWorld'); // this is for multiline output

  // var / final / const variableName = value

  var x = 6;        // now x is inferred as int
  var y = "Vikash"; // now y is inferred as String

  // final value is only set once (runtime)
  // const value is fixed at compile time

  print(DateTime.now());
}