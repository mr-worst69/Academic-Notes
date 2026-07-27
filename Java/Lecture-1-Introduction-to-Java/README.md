# Introduction to Programming Language II (Java)

Java is a high-level, object-oriented programming language used to build desktop applications, web applications, mobile applications, enterprise software, and many other types of programs.

One of the most important features of Java is its ability to run on different operating systems through the Java Virtual Machine.

---

## 1. Java Is a Platform-Independent Language

Java is called a **platform-independent language** because a Java program can run on different operating systems without rewriting the source code for each platform.

Examples of supported platforms include:

- Windows
- macOS
- Linux

Java achieves platform independence by compiling source code into an intermediate format called **bytecode**.

The bytecode is then executed by the **Java Virtual Machine (JVM)**.

### Basic Execution Flow

```text
Java Source Code
        ↓
Java Compiler
        ↓
Bytecode
        ↓
Java Virtual Machine
        ↓
Native Machine Code
        ↓
Program Execution
```

---

## 2. Java Source Code

A developer writes a Java program as source code.

Java source-code files normally use the following extension:

```text
.java
```

The source code is written in a form that humans can read and understand.

However, a computer processor cannot directly execute Java source code. Therefore, it must first be compiled.

---

## 3. Java Compiler

The Java compiler converts Java source code into bytecode.

The Java compiler is commonly called:

```text
javac
```

After compilation, Java produces a file with the following extension:

```text
.class
```

The `.class` file contains Java bytecode.

### Compilation Process

```text
Java Source File (.java)
          ↓
      Java Compiler
          ↓
Bytecode File (.class)
```

---

## 4. Bytecode

**Bytecode** is an intermediate form of Java code created by the Java compiler.

Bytecode is not designed for a specific processor or operating system.

Therefore, the same bytecode can be used on different platforms.

For example, the same `.class` file may run on:

- Windows
- macOS
- Linux

A compatible JVM must be available on the platform.

### Important Characteristics of Bytecode

- It is generated from Java source code.
- It is stored in `.class` files.
- It is platform-neutral.
- It cannot normally run directly on the processor.
- It is executed or translated by the JVM.

---

## 5. Java Virtual Machine in Program Execution

The **Java Virtual Machine (JVM)** receives Java bytecode and converts it into native machine code.

Native machine code is the instruction format understood by a specific computer processor and operating system.

The JVM acts as a layer between Java bytecode and the underlying operating system.

```text
Java Bytecode
      ↓
     JVM
      ↓
Platform-Specific Machine Code
```

Different operating systems require different JVM implementations.

For example:

```text
Java Bytecode → Windows JVM → Windows Machine Code

Java Bytecode → macOS JVM → macOS Machine Code

Java Bytecode → Linux JVM → Linux Machine Code
```

The bytecode remains the same, but the JVM is different for each platform.

---

## 6. Platform-Independent and Platform-Dependent Components

Java bytecode is **platform-independent**, but the JVM is **platform-dependent**.

### Platform-Independent

```text
Java Source Code
Java Bytecode
```

The same bytecode can be used on different operating systems.

### Platform-Dependent

```text
Java Virtual Machine
Native Machine Code
```

Each operating system requires a JVM designed for that specific platform.

This distinction is very important:

> Java is platform-independent because its bytecode can run on any platform with a compatible JVM.

---

## 7. Write Once, Run Anywhere

Java follows the principle:

> **Write Once, Run Anywhere**

It is commonly abbreviated as:

```text
WORA
```

This means that a developer can write and compile a Java program once, and the resulting bytecode can run on different platforms.

A separate source-code version is not required for every operating system.

### WORA Process

```text
Write Java Code Once
          ↓
Compile into Bytecode
          ↓
Run on Any Compatible JVM
```

---

# JVM, JRE, and JDK

JVM, JRE, and JDK are three important components of the Java platform.

They are related, but they perform different roles.

---

## 8. JVM — Java Virtual Machine

**JVM** stands for:

```text
Java Virtual Machine
```

The JVM is responsible for running Java programs.

It processes Java bytecode and converts it into machine code that the computer can execute.

### Responsibilities of the JVM

- Loads Java bytecode
- Verifies the bytecode
- Executes Java programs
- Converts bytecode into machine code
- Provides platform independence
- Manages memory during program execution

### Important Point

The JVM is platform-dependent.

Windows, macOS, and Linux use different JVM implementations.

However, all compatible JVMs can process the same Java bytecode.

---

## 9. JRE — Java Runtime Environment

**JRE** stands for:

```text
Java Runtime Environment
```

The JRE provides the environment required to run Java applications.

It includes:

- JVM
- Java class libraries
- Supporting runtime files

The JRE does not normally include development tools such as the Java compiler.

Therefore, it is mainly used by users who only need to run Java applications.

### Main Purpose of JRE

```text
Running Java Programs
```

### JRE Contains

```text
JRE
├── JVM
├── Java Libraries
└── Runtime Files
```

---

## 10. JDK — Java Development Kit

**JDK** stands for:

```text
Java Development Kit
```

The JDK is used to develop Java applications.

It includes everything required to:

- Write Java programs
- Compile Java programs
- Run Java programs
- Debug Java programs
- Create Java applications

The JDK includes:

- JRE
- JVM
- Java compiler
- Debugger
- Documentation tools
- Other development utilities

### Main Purpose of JDK

```text
Developing and Running Java Programs
```

### JDK Contains

```text
JDK
├── JRE
│   ├── JVM
│   ├── Java Libraries
│   └── Runtime Files
├── Java Compiler
├── Debugger
└── Development Tools
```

---

## 11. Relationship Between JVM, JRE, and JDK

The relationship can be represented as:

```text
JDK
└── JRE
    └── JVM
```

This means:

- JVM is part of the JRE.
- JRE is part of the JDK.
- JDK contains both runtime and development tools.

Another representation is:

```text
JDK = JRE + Development Tools

JRE = JVM + Runtime Libraries
```

---

## 12. Difference Between JVM, JRE, and JDK

| Java Term | Full Form | Main Purpose | Main Components |
|---|---|---|---|
| JVM | Java Virtual Machine | Executes Java bytecode | Bytecode execution system |
| JRE | Java Runtime Environment | Provides an environment to run Java programs | JVM and runtime libraries |
| JDK | Java Development Kit | Develops, compiles, and runs Java programs | JRE, compiler, debugger, and development tools |

### Easy Identification

```text
Only want to run Java programs → JRE

Want to write and compile Java programs → JDK

Component that actually executes bytecode → JVM
```

---

# Movie Analogy for JVM, JRE, and JDK

The relationship between JVM, JRE, and JDK can be understood using a movie analogy.

## 13. JVM as an Actor on Stage

The JVM is like an **actor on a stage**.

The actor reads and performs the script.

Similarly, the JVM reads and executes Java bytecode.

```text
Actor performs the script
JVM executes the bytecode
```

---

## 14. JRE as a Movie Theatre

The JRE is like a **movie theatre**.

A theatre provides the environment required to watch a movie.

Similarly, the JRE provides the environment required to run a Java application.

```text
Movie Theatre → Environment for watching a movie

JRE → Environment for running a Java program
```

---

## 15. JDK as a Director’s Studio

The JDK is like a **director’s studio**.

A director’s studio contains the tools required to create, edit, and prepare a movie.

Similarly, the JDK contains the tools required to write, compile, debug, and develop Java programs.

```text
Director's Studio → Creates and edits movies

JDK → Creates and develops Java applications
```

---

## 16. Movie Analogy Summary

| Java Term | Movie Analogy | Role |
|---|---|---|
| JVM | Actor on stage | Executes the script or bytecode |
| JRE | Movie theatre | Provides the environment to run the application |
| JDK | Director’s studio | Provides tools to create and develop the application |

---

# Class and Object in Java

Java is an object-oriented programming language.

Two fundamental concepts of object-oriented programming are:

- Class
- Object

---

## 17. Class in Java

A **class** is a blueprint or template used to create objects.

It defines the structure and behaviour that its objects will have.

A class may define:

- Attributes or variables
- Behaviours or methods

The class describes what information an object can contain and what actions it can perform.

### Examples

A `Car` class may define:

- Colour
- Brand
- Speed
- Start behaviour
- Stop behaviour

A `Student` class may define:

- Name
- ID
- Age
- Study behaviour
- Display behaviour

A class defines the structure, but an object stores the actual values.

---

## 18. Object in Java

An **object** is an instance of a class.

An object is created based on the structure defined by a class.

It contains actual data and can perform the actions defined by the class.

### Example

```text
Class  → Car

Objects:
- My Toyota
- Your BMW
- A Honda Civic
```

All these objects are created from the `Car` class, but they may contain different values.

For example:

```text
Object 1:
Brand  → Toyota
Colour → Black

Object 2:
Brand  → BMW
Colour → White
```

---

## 19. Difference Between Class and Object

| Class | Object |
|---|---|
| A blueprint or template | An instance of a class |
| Defines attributes and methods | Contains actual values |
| Represents a general structure | Represents a specific entity |
| Used to create objects | Created from a class |
| Does not represent one specific real item | Represents an actual item in memory |

### Simple Example

```text
Class  → Student

Object → A specific student named Rahim
```

---

## 20. Class and Object Relationship

The relationship between a class and an object can be represented as:

```text
Class
  ↓
Creates
  ↓
Object
```

A single class can be used to create multiple objects.

```text
Student Class
├── Student Object 1
├── Student Object 2
└── Student Object 3
```

Each object follows the same structure but can hold different data.

---

# Important Key Points

- Java is a platform-independent programming language.
- Java source code is stored in `.java` files.
- The Java compiler converts source code into bytecode.
- Bytecode is stored in `.class` files.
- Bytecode is platform-neutral.
- JVM converts bytecode into platform-specific machine code.
- JVM is platform-dependent.
- Java follows the “Write Once, Run Anywhere” principle.
- JVM executes Java bytecode.
- JRE provides the environment required to run Java programs.
- JDK provides the tools required to develop Java programs.
- JDK contains JRE, and JRE contains JVM.
- A class is a blueprint for creating objects.
- An object is an instance of a class.
- A class defines attributes and methods.
- An object contains actual values and performs defined actions.

---

# Quick Revision

```text
.java file
    ↓
Java Compiler
    ↓
.class file containing bytecode
    ↓
JVM
    ↓
Machine Code
    ↓
Program Runs
```

```text
JDK = JRE + Development Tools

JRE = JVM + Runtime Libraries
```

```text
Class  = Blueprint
Object = Instance of a Class
```

---

# One-Line Summaries

**Java Platform Independence:**  
Java bytecode can run on different operating systems using a compatible JVM.

**JVM:**  
The JVM executes Java bytecode by converting it into machine code.

**JRE:**  
The JRE provides the environment and libraries required to run Java applications.

**JDK:**  
The JDK provides all tools required to develop, compile, debug, and run Java applications.

**Class:**  
A class is a blueprint or template used to create objects.

**Object:**  
An object is an instance of a class that contains actual values and performs actions.
