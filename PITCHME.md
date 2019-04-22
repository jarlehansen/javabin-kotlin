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

