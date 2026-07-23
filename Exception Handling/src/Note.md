## Types of Errors

### 1. Syntax Errors
These occur when the code violates the rules of the programming language, such as:
- Missing parentheses
- Incorrect indentation
- Missing semicolons (in languages where required)

### 2. Runtime Errors
These occur while the program is running and can be caused by issues such as:
- Division by zero
- Accessing invalid memory
- Using a variable that has not been initialized

### 3. Logical Errors
These occur when the program runs without crashing but produces incorrect results due to flaws in the logic or algorithm used in the code.

---

## Exceptions

1. Exceptions provide a way to handle errors in a controlled manner.
2. They allow a program to continue running even when an error occurs by providing a mechanism to catch and handle errors gracefully.
3. In many programming languages, exceptions can be raised when an error occurs and caught using `try-catch` blocks (or similar constructs).
4. This enables developers to:
    - Display meaningful error messages
    - Perform cleanup operations
    - Take alternative actions when an error is encountered
    - Prevent unexpected program crashes

### What is an Exception?

An **Exception** is an event that disrupts the normal flow of a program. It is an object that is thrown at runtime when an error occurs.

Exceptions can be handled using `try-catch` blocks, where:
- The code that may throw an exception is placed inside the `try` block.
- The `catch` block contains the code that handles the exception.

This allows for graceful error handling and recovery in programs.

---

## Java Exception Hierarchy

```text
Throwable
├── Exception
│   ├── RuntimeException
│   │   ├── NullPointerException
│   │   ├── ArithmeticException
│   │   ├── ArrayIndexOutOfBoundsException
│   │   └── ClassCastException
│   │
│   ├── IOException
│   │   └── FileNotFoundException
│   │
│   └── SQLException
│
└── Error
    ├── OutOfMemoryError
    ├── StackOverflowError
    └── AssertionError
```

Types of Exceptions:
1. **Checked Exceptions**: These are exceptions that are checked at compile-time. The programmer is required to handle these exceptions using `try-catch` blocks or by declaring them in the method signature using the `throws` keyword. Examples include `IOException`, `SQLException`, etc.
2. **Unchecked Exceptions**: These are exceptions that are not checked at compile-time. They are usually caused by programming errors, such as logic mistakes or improper use of an API. Examples include `NullPointerException`, `ArrayIndexOutOfBoundsException`, etc.

Other Definitions:
1. **Errors**: These are serious problems that a reasonable application should not try to catch. They are usually external to the application and indicate issues with the environment in which the application is running. Examples include `OutOfMemoryError`, `StackOverflowError`, etc.
2. **Custom Exceptions**: Developers can create their own exception classes by extending the `Exception` class or any of its subclasses. This allows for more specific error handling tailored to the application's needs.
3. **Runtime Exceptions**: These are a subset of unchecked exceptions that occur during the execution of the program. They typically indicate programming errors, such as invalid arguments or illegal state. Examples include `IllegalArgumentException`, `IllegalStateException`, etc.
4. **Checked vs Unchecked Exceptions**: The main difference between checked and unchecked exceptions is that checked exceptions must be explicitly handled or declared, while unchecked exceptions do not require explicit handling. This distinction allows developers to choose the appropriate exception handling strategy based on the nature of the error and the desired program behavior.
