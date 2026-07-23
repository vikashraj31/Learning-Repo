void main() {

  // Null value (Nullable variables)

  int? a = null;
  String? b = null;

  // int a = null;      // ❌ Not allowed (non-nullable variable)
  // String b = null;   // ❌ Not allowed

  print(b);       // Output: null

  // ?? (Null Coalescing Operator)
  // If b is null, then print the value after ??
  print(b ?? 0);  // Output: 0
}