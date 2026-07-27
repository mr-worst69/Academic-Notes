# Basics of Object-Oriented Programming (OOP)

## 1. What is Object-Oriented Programming?

Object-Oriented Programming, commonly known as OOP, is a programming approach in which programs are designed using classes and objects.
## 2. Real-Life Example

Consider a **Car**.

A car has some information or characteristics, such as:

### Attributes

- Colour
- Brand
- Speed

A car can also perform different actions, such as:

### Behaviours or Methods

- `start()`
- `accelerate()`
- `stop()`

The relationship can be understood as follows:

| Example | OOP Element |
|---|---|
| Car | Class |
| My Toyota | Object |
| Colour | Attribute |
| `start()` | Method |

---

## 3. What is a Class?

A **class** is a blueprint or template used to create objects.

A class defines:

- What data an object will store
- What actions an object can perform

For example, a `Student` class may store a student's name and age:

```java
class Student
{
    String name;
    int age;
}
```

Here:

- `name` is an attribute
- `age` is an attribute
- `String` and `int` are data types

The class only defines the structure. An actual student object must be created from the class.

---

## 4. What is an Object?

An **object** is a real instance of a class.

For example:

```text
Class  → Student
Object → A specific student
```

A class acts as the blueprint, while an object contains actual data based on that blueprint.

---

## 5. Attributes

**Attributes** are variables declared inside a class. They store information about an object.

Example:

```java
String name;
int age;
```

Here:

- `name` stores the student's name
- `age` stores the student's age

Attributes are also called:

- Data members
- Fields
- Instance variables

---

## 6. Methods

Methods define the actions or behaviours that an object can perform.

Example:

```java
void display()
{
    System.out.println(name);
}
```

In this method:

- `void` means the method does not return any value
- `display` is the method name
- `System.out.println(name)` prints the value of `name`

---

## Key Points

- OOP uses classes and objects to organise a program.
- A class is a blueprint for creating objects.
- An object is an instance of a class.
- Attributes store the data of an object.
- Methods define the behaviour of an object.
- A class specifies what an object has and what it can do.

---

## One-Line Summary

**Object-Oriented Programming is a programming approach that organises data and behaviour using classes and objects.**
