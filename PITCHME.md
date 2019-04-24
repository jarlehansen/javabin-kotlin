---?image=assets/img/kotlin-logo2.png&size=cover

---
@snap[span-100]
### Agenda
@snapend

* History of Kotlin
* Why Kotlin?
* Code
* Code
* Code
* Summary
* Bonus: Puzzles

---?image=assets/img/kart1.png&size=65% auto

---?image=assets/img/kart2.png&size=65% auto

----?video=https://video.twimg.com/tweet_video/DyUYJpkXQAAoWnE.mp4&loop=true&muted=true

---?image=assets/img/kotlin-github.jpg&size=contain
---?image=assets/img/kotlin-digi.jpg&size=contain
---?image=assets/img/hvorfor-kotlin.jpg&size=contain

---?image=assets/img/most-loved.jpg&size=contain
@snap[south text-black span-100]
**Stack overflow survey 2018**
@snapend

---
@snap[span-100]
### Why Kotlin?
@snapend

* Interoperability with Java
  * Java -> Kotlin
  * Kotlin -> Java

---

* Less code to achieve the same functionality
  * *Rough estimates indicate approximately a 40% cut in the number of lines of code* (JetBrains)

---

* Useful features:
  * Null safety
  * Extension functions
  * Data classes

---

* Multi-paradigm
  * Object oriented
  * Functional
  * You decide what works best 4 U!

---

* Excellent tool support

---?image=assets/img/kotlin-usage.png&size=cover

---


![Show me the code](assets/img/talk-is-cheap-show-me-the-code.jpg)


---
@snap[span-100]
### Companion object - closest to static you will come
@snapend

* No static methods in Kotlin
* Functions doesn't cover your needs? Use companion objects


---?gist=markydawn/447d71f92c277bc7cc8dda0f3ff95921&lang=kotlin

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
### Operator overloading
@snapend
 
* Like in C++, you can overload various operators (+, -, += etc.)
* Creating a 3D game? Simply multiply two vectors to get a cross-product!
* Don't have to be part of the class definition, create an extension function if you miss something!
 
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
// TODO: see file filestats.kts
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
