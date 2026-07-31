// Dart List Example

void main() {

  // Create a list
  List<int> myList = [10, 20, 30, 40];
  print(myList);

  // Access an item using index
  print(myList[0]); // First element
  print(myList[2]); // Third element

  // Change an item
  myList[1] = 25;
  print(myList);

  // Create an empty list
  List<int> emptyList = [];

  // Add one item
  emptyList.add(41);
  print(emptyList);

  // Add multiple items
  emptyList.addAll([1, 2, 3]);
  print(emptyList);

  // Insert item at specific index
  myList.insert(2, 99);
  print(myList);

  // Insert multiple items
  myList.insertAll(1, [100, 200]);
  print(myList);

  // Mixed list (Different data types)
  List mixedList = [1, "John", true, 19.5];
  print(mixedList);

  // Remove an item by value
  myList.remove(99);
  print(myList);

  // Remove item using index
  myList.removeAt(0);
  print(myList);
}