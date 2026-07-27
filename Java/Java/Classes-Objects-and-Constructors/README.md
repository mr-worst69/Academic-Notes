# Classes, Objects, Constructors, and the `this` Keyword in Java

This note explains classes, objects, object creation, constructors, constructor types, constructor overloading, the `this` keyword, constructor chaining, and the difference between constructors and methods in Java.

---

## 1. What is a Class?

A **class** is a blueprint or template used to create objects.

It defines:

- Attributes or variables
- Behaviours or methods

A class describes what data an object will contain and what actions it will be able to perform.

### Example

```java
class Car {
    String brand;
    int year;
}
```

Here:

- `Car` is the class name.
- `brand` is an attribute of type `String`.
- `year` is an attribute of type `int`.

The class defines the structure, but it does not represent a specific car.

---

## 2. What is an Object?

An **object** is an instance of a class.

It contains actual values and can invoke the methods defined inside the class.

### Example

```java
Car myCar = new Car();
```

Here:

- `Car` is the class.
- `myCar` is a reference variable.
- `new Car()` creates a new object.
- The reference of the new object is assigned to `myCar`.

A class is a general blueprint, whereas an object represents a specific entity.

```text
Class  → Car
Object → myCar
```

---

## 3. Creating a Class in Java

A class can contain attributes and methods.

### Example

```java
class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
```

### Explanation

- `brand` and `year` are attributes.
- `display()` is a method.
- The method prints the values stored in the object.

---

## 4. Creating Objects in Java

An object is created using the `new` keyword.

After creating the object, values can be assigned to its attributes and its methods can be called.

### Example

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.year = 2022;

        car1.display();
    }
}
```

### Output

```text
Brand: Toyota, Year: 2022
```

### Explanation

```java
Car car1 = new Car();
```

creates an object of the `Car` class.

```java
car1.brand = "Toyota";
car1.year = 2022;
```

assigns actual values to the attributes.

```java
car1.display();
```

invokes the `display()` method.

---

## 5. Understanding the `new` Keyword

The `new` keyword dynamically allocates memory for an object.

It creates a new object and returns a reference to that object.

### Syntax

```java
ClassName referenceVariable = new ClassName();
```

### Example

```java
Car car1 = new Car();
```

### Steps Performed by `new`

When an object is created using `new`, the following operations occur:

1. Memory is allocated for the object.
2. The appropriate constructor is invoked.
3. The object is initialized.
4. A reference to the object is returned.
5. The reference is assigned to a variable.

```text
new keyword
     ↓
Memory allocation
     ↓
Constructor invocation
     ↓
Object initialization
     ↓
Reference assignment
```

---

# Constructors in Java

## 6. What is a Constructor?

A **constructor** is a special member of a class used to initialize objects.

It is automatically called when an object is created.

### Example

```java
class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }
}
```

Here:

- `Car` is the constructor name.
- `b` and `y` are parameters.
- The constructor initializes `brand` and `year`.

An object can be created using this constructor:

```java
Car car1 = new Car("Toyota", 2022);
```

---

## 7. Properties of a Constructor

### 7.1 Same Name as the Class

A constructor must have the same name as its class.

```java
class Car {
    Car() {
    }
}
```

Both the class and constructor are named `Car`.

---

### 7.2 No Return Type

A constructor does not have a return type.

It does not use:

```java
void
```

or any other data type.

Correct:

```java
Car() {
}
```

Incorrect:

```java
void Car() {
}
```

The second example is treated as a method, not a constructor.

---

### 7.3 Automatically Called

A constructor is automatically invoked when an object is created.

```java
Car car1 = new Car();
```

The `Car()` constructor is called automatically.

---

### 7.4 Can Be Overloaded

A class can contain multiple constructors with different parameter lists.

This is known as **constructor overloading**.

```java
Car() {
}

Car(String brand) {
}

Car(String brand, int year) {
}
```

---

### 7.5 Cannot Be Inherited

Constructors are not inherited by subclasses.

However, a subclass can call a constructor of its parent class using:

```java
super();
```

The `super()` call must be the first statement in the child-class constructor.

---

## 8. Types of Constructors

The main types discussed in this lecture are:

1. Default constructor
2. Parameterized constructor
3. Copy constructor

---

## 9. Default Constructor

A default constructor has no parameters.

It initializes an object with default or predefined values.

### Example

```java
class Car {
    String brand;
    int year;

    Car() {
        brand = "Unknown";
        year = 0;
    }
}
```

Object creation:

```java
Car car1 = new Car();
```

The object receives:

```text
Brand → Unknown
Year  → 0
```

> When no constructor is written, Java may provide an implicit no-argument constructor. A manually written constructor with no parameters is commonly called a no-argument constructor.

---

## 10. Parameterized Constructor

A parameterized constructor accepts arguments and uses them to initialize an object.

### Example

```java
class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }
}
```

Object creation:

```java
Car car1 = new Car("Toyota", 2022);
```

The values passed during object creation are stored inside the object.

---

## 11. Copy Constructor

A copy constructor creates a new object by copying the values of another object.

Java does not provide a built-in copy constructor automatically. It must be defined by the programmer.

### Example

```java
class Car {
    String brand;
    int year;

    Car(Car c) {
        this.brand = c.brand;
        this.year = c.year;
    }
}
```

Object creation:

```java
Car car1 = new Car("Toyota", 2022);
Car car2 = new Car(car1);
```

Here, `car2` receives copies of the values stored in `car1`.

---

## 12. Complete Example of Constructor Types

```java
class Car {
    String brand;
    int year;

    // Default or no-argument constructor
    Car() {
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }

    // Copy constructor
    Car(Car c) {
        this.brand = c.brand;
        this.year = c.year;
    }
}
```

---

# Constructor Overloading

## 13. What is Constructor Overloading?

**Constructor overloading** allows a class to contain multiple constructors with different parameter lists.

The appropriate constructor is selected according to the arguments passed while creating an object.

Constructors can differ by:

- Number of parameters
- Types of parameters
- Order of parameter types

They cannot be overloaded only by changing parameter names.

---

## 14. Constructor Overloading Example

```java
class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    Car(String b) {
        brand = b;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class NewClass {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        car1.display();
    }
}
```

### Output

```text
Brand: Toyota, Year: 2022
```

The constructor with two parameters is selected because two arguments are passed:

```java
new Car("Toyota", 2022);
```

An object could also be created using the one-parameter constructor:

```java
Car car2 = new Car("BMW");
```

---

# The `this` Keyword

## 15. What is the `this` Keyword?

The `this` keyword refers to the current object of a class.

It can be used to access the current object's:

- Instance variables
- Methods
- Constructors

It is commonly used when instance variables and parameters have the same names.

---

## 16. Using `this` with Instance Variables

Consider this constructor:

```java
Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
}
```

Here:

```java
this.brand
```

refers to the instance variable of the current object.

The value on the right side:

```java
brand
```

refers to the constructor parameter.

Therefore:

```java
this.brand = brand;
```

means:

> Assign the parameter `brand` to the current object's instance variable `brand`.

---

## 17. Example Using the `this` Keyword

```java
class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class NewClass {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        car1.display();
    }
}
```

### Output

```text
Brand: Toyota, Year: 2022
```

Without `this`, Java would not clearly distinguish the instance variables from the parameters with the same names.

---

# Constructor Chaining

## 18. What is `this()`?

The expression:

```java
this();
```

is used to call another constructor within the same class.

When arguments are required, they are passed inside the parentheses:

```java
this(value);
```

or:

```java
this(value1, value2);
```

### Important Rule

`this()` must be the first statement inside a constructor.

It cannot appear after another statement.

---

## 19. What is Constructor Chaining?

**Constructor chaining** is the process of calling one constructor from another constructor.

Within the same class, constructor chaining is performed using:

```java
this();
```

A parent-class constructor is called using:

```java
super();
```

Constructor chaining helps:

- Reduce duplicate code
- Reuse initialization logic
- Improve code readability
- Make constructors easier to maintain

---

## 20. Constructor Chaining Example

```java
class Car {
    String brand;
    int year;

    Car(String b) {
        brand = b;
    }

    Car(String b, int y) {
        this(b);
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class NewClass {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        car1.display();
    }
}
```

### How It Works

The following constructor is called first:

```java
Car(String b, int y)
```

Its first statement is:

```java
this(b);
```

This calls:

```java
Car(String b)
```

The one-parameter constructor initializes `brand`.

Control then returns to the two-parameter constructor, which initializes `year`.

### Output

```text
Brand: Toyota, Year: 2022
```

---

# Constructor vs Method

## 21. Difference Between a Constructor and a Method

| Constructor | Method |
|---|---|
| Initializes a newly created object | Performs an operation or behaviour |
| Has the same name as the class | Can have any valid method name |
| Does not have a return type | May return a value or use `void` |
| Called automatically during object creation | Called explicitly using an object or class |
| Invoked using the `new` keyword | Invoked using its method name |
| Can be overloaded | Can also be overloaded |
| Cannot be inherited | Methods may be inherited |

### Constructor Example

```java
Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
}
```

### Method Example

```java
void display() {
    System.out.println(brand);
}
```

---

# Quick Revision

```text
Class       → Blueprint for creating objects
Object      → Instance of a class
new         → Allocates memory and creates an object
Constructor → Initializes an object
this        → Refers to the current object
this()      → Calls another constructor in the same class
super()     → Calls a parent-class constructor
```

---

# Key Points

- A class defines attributes and methods.
- An object is an instance of a class.
- Objects are normally created using the `new` keyword.
- The `new` keyword allocates memory and returns an object reference.
- A constructor initializes an object.
- A constructor has the same name as its class.
- A constructor has no return type.
- Constructors are called automatically during object creation.
- Constructors can be overloaded.
- Constructors are not inherited.
- A default or no-argument constructor has no parameters.
- A parameterized constructor accepts values through parameters.
- A copy constructor copies values from another object.
- Constructor overloading uses different parameter lists.
- The `this` keyword refers to the current object.
- `this()` calls another constructor in the same class.
- `this()` must be the first statement in a constructor.
- Constructor chaining reduces code duplication.
- Parent-class constructors are called using `super()`.

---

# One-Line Summary

**Classes define the structure of objects, constructors initialize those objects, and the `this` keyword refers to the current object or connects constructors through constructor chaining.**
