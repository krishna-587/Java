# Generics
Introduced in Java 5, generics allow you to create classes, interfaces, and methods with a placeholder for types. This enables type safety and eliminates the need for casting when working with collections.

### Benefits of Generics
1. **Type Safety**: Generics provide compile-time type checking, which helps catch errors early in the development process. This reduces the risk of `ClassCastException` at runtime.
2. **Elimination of Casting**: With generics, you can avoid explicit casting when  working with collections. This makes the code cleaner and easier to read.
3. **No compile time checking**: Generics allow you to create classes, interfaces, and methods that can operate on different types without the need for explicit casting. This makes your code more flexible and reusable.

### Generic Type
A generic type is a class or interface that is parameterized over types. For example, a generic class can work with any type specified by the user, and that type can be enforced at compile time.