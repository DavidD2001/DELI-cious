# DELI-cious
CLI-based Java app for sandwich shop
# DELI-cious Point of Sale

This is a CLI-based point-of-sale system for a customizable sandwich shop. Built as a capstone project, it demonstrates knowledge of object-oriented programming, inheritance, and clean user interface design.

## Features

- Custom and Signature Sandwich Creation
- Add-on Drinks and Chips
- Live order building with price calculation
- Receipt generation
- Cancel or checkout orders
- Orders display newest items first

## Screenshots

### Home Screen


### Sandwich Creation


### Receipt Output


## Interesting Code

### Order Menu Input and Dispatch
```java
switch (choice) {
    case "1": order.add(SandwichBuilder.buildSandwich(scanner)); break;
    case "2": order.add(DrinkBuilder.buildDrink(scanner)); break;
    ...
}
