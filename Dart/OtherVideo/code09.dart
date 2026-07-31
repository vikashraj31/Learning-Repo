// Dart Type Conversion

void main() {

  // ---------------- String to int ----------------
  var a = 40;
  var b = "1";

  // Convert String to int
  var c = a + int.parse(b);

  print("$a + $b = $c");


  // ---------------- String to double ----------------
  var d = 40;
  var e = "0.1";

  // Convert String to double
  var f = d + double.parse(e);

  print("$d + $e = $f");


  // ---------------- int to String ----------------
  var g = 40;
  var h = "1";

  // Convert int to String
  var i = g.toString() + h;

  print("$g + $h = $i");
}