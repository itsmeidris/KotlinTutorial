# Kotlin Basics Cheat Sheet

## 1. Compiling source code in Kotlin
▶ 1. Compile a Single File

kotlinc Main.kt -include-runtime -d Main.jar
java -jar Main.jar

-include-runtime: packages Kotlin’s runtime into your JAR.
-d Main.jar: outputs a JAR file named Main.jar.

📂 3. Compile Multiple Files or Packages
If you have multiple files or packages (e.g., Main.kt and utils/Helper.kt):

kotlinc utils/Helper.kt Main.kt -include-runtime -d App.jar
java -jar App.jar

## 2. Achieving "Static" in Kotlin

Kotlin does not have a `static` keyword like Java. To achieve static-like behavior, you use **companion objects** inside a class or top-level functions and properties.

Example:

```kotlin
class MyClass {
    companion object {
        fun greet() = "Hello from companion!"
    }
}

fun main() {
    println(MyClass.greet())
}
```

Or simply define a **top-level function** (outside any class):

```kotlin
fun greet() = "Hello!"
```

---

## 3. What Is a Companion Object?

A **companion object** is a singleton object inside a class. It allows you to define members that behave like Java's `static`. Each class can have **one companion object**.

Example:

```kotlin
class Utils {
    companion object {
        val version = "1.0"
        fun printVersion() = println("Version: $version")
    }
}

fun main() {
    Utils.printVersion() // Accessed without creating an instance
}
```

---

## 4. Ternary Operator in Kotlin

Kotlin **does not have a ternary operator** (`condition ? a : b`). Instead, you use an `if` expression directly:

```kotlin
val result = if (x > 0) "Positive" else "Negative"
```

The `if` in Kotlin **returns a value**, so it replaces ternary behavior.

---

## 5. What Is an `init` Block in Kotlin?

The **`init` block** is executed **immediately after** the primary constructor is called and before any secondary constructors or functions.

Example:

```kotlin
class Person(val name: String) {
    init {
        println("Person initialized with name: $name")
    }
}

fun main() {
    val p = Person("Driss") // Triggers init block
}
```

Usage:

* Perform setup or validation when an object is created.
* Useful for logging or checking constructor arguments.

---

## 6. Use of the `lazy` Keyword

The **`lazy`** keyword is used for **lazy initialization**. The value is computed only **once**, the first time it is accessed, and then cached for future use.

Example:

```kotlin
val heavyComputation: String by lazy {
    println("Computing...")
    "Result after heavy computation"
}

fun main() {
    println("Before access")
    println(heavyComputation) // Computation happens here
    println(heavyComputation) // Cached value, no recomputation
}
```

Benefits:

* Improves performance by delaying expensive computations.
* Ensures thread-safe initialization by default.
