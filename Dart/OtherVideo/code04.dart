// Dart Maps

void main() {

  // Create a map (Key : Value)
  Map<String, String> toppings = {
    "John": "Pepperoni",
    "Mary": "Cheese"
  };

  print(toppings);

  // Show all values
  print(toppings.values);

  // Show all keys
  print(toppings.keys);

  // Show total key-value pairs
  print(toppings.length);

  // Add one key-value pair
  toppings["Tim"] = "Sausage";
  print(toppings);

  // Add multiple key-value pairs
  toppings.addAll({
    "Tina": "Bacon",
    "Steve": "Supreme"
  });
  print(toppings);

  // Remove a key-value pair
  toppings.remove("Steve");
  print(toppings);

  // Remove all key-value pairs
  toppings.clear();
  print(toppings);
}