---
@snap[span-100]
### Code
@snapend
---
@snap[span-100]
### Companion object - closest to static you will come
@snapend

* No static methods in Kotlin
* Functions doesn't cover your needs? Use companion objects

---

```kotlin
// companion object (or how to do "static" in Kotlin)
class ClassWithCompanion {
	// other methods that aren't "static"...?

    companion object {
        fun staticMethod() = "Im static..."
    }
}
```

---
@snap[span-100]
### Singleton pattern - Java vs Kotlin
@snapend

#### Java
```java
public class Singleton {
    private static final Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
	
	// ... methods ...
}
```

---

#### Kotlin
```kotlin
object Singleton {
	// ... methods ... 
}
```
---
@snap[span-100]
### DSL - domain specific languages
@snapend

---
@snap[span-100]
### Reified generics / inline functions
@snapend

---
@snap[span-100]
### Operator overloading
@snapend
 
* Like in C++, you can overload various operators (+, -, += etc.)
* Creating a 3D game? Simply multiply two vectors to get a cross-product!
 
---

#### Example of defining one yourself
```kotlin
class Vector(val x : Float, val y: Float, val z : Float) {
    // ... other method ...

    // cross product
    operator fun times(otherVec : Vector) : Vector {
        return Vector(y*otherVec.z - z*otherVec.y,
                      z*otherVec.x - x*otherVec.z,
                      x*otherVec.y - y*otherVec.x)
    }
}

// ---
// can multiply two vector objects and get a new vector back (the cross product)
val crossProd = Vector(0.0, 1.0, 0.0)*Vector(1.0, 0.0, 0.0)
```

---

#### Defintion using extension function
```kotlin
operator fun Float.times(vector : Vector) : Vector {
    return Vector(this*vector.x, this*vector.y, this*vector.z)
}
```

---

#### Example in standard library - list add
```kotlin
val primes = mutableListOf(2, 3, 5)
primes += 7
// list now contains: 2, 3, 5, 7
```

---
@snap[span-100]
### Kotlin scripting
@snapend

```kotlin
#!/usr/bin/env kotlinc-jvm -script

import java.io.File

// slightly modified example from Venkats Programming Kotlin
// we always do file operations in scripts, so it is such a good example anyway :P 
File(".").walk().filter {
	it.extension.isNotEmpty()
}.groupingBy{
	it.extension
}.eachCount().forEach { (key, value) ->
    println("$key - $value")
}
```

---

* Syntax-check happens before run
* Use any Kotlin JVM functionality
* For more advanced features consider using KScript

---


@snap[span-100]
### Kotlin isn't simply a JVM language...
@snapend

* Compiles to...
   * JavaScript
   * WebAssembly
   * Android
   * KotlinNative (iOS, Android, native binaries etc.)

---
@snap[span-100]
### What we didn't cover
@snapend

[comment]: <> (Remove if we actually cover one of these)
* Sealed classes
* Pattern matching with `when`
* Clever-casting with `is` and `as`
* Init-blocks and multiple constructors
* Standard OOP concepts that are similar to Java (interfaces, abstract classes and how they are used)
* ...
