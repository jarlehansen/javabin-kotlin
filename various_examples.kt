/*
 * Just big unstructured file of code snippets we can use for live-coding or examples...
 */

/*
 * vars, var immutability
 */
val numberOfSidesInASquare : Int = 4

val iAmConstant = "final"
var iCanChange = 1

iAmConstant = 3   // compiler error because of type-change and re-assignment
iCanChange = 4    // legal
iCanChange = "no" // compiler error due to type-change



/* 
 * Various smaller parts of syntax
 */ 
// ifs are expressions now! so are switch statements
val resultOfExpression =
        if (numberOfSidesInASquare == 4)
            "Obviously..."
        else
            "If we did end up here, it would be the end of Europe as we know it"

// prettier print statements!
println("${1+1}")

// ranges
for (number in 1..10) {
    println("Number: $number")
}
// Output:
// Number: 1
// Number: 2
// Number: 3
// Number: 4
// Number: 5
// Number: 6
// Number: 7
// Number: 8
// Number: 9
// Number: 10

// same, but with behaviour similar to Java-forloop
for (number in 1 until 10) {
    println("Number: $number")
}

// more "advanced" for-loop
for (number in 10 downTo 1 step 2) {
    println("Number: $number")
}

// when expressions
when(numberOfSidesInASquare) {
    0 -> println("I bet you aced math in school ;)")
    4 -> println("Obviously...")
    else -> println("")
}



/* 
 * Functions
 */ 
fun main() {
	// ... main function body  without arguments (Kotlin 1.3 and newer) ...
}

fun main(args: Array<String>) {
	// ... main function with arguments ...
}

fun square(number: Int) = number * number

fun square(number: Int) : Int {
	return number * number
}


/* 
 * Classes
 */ 
// TODO: add regular classes, open classes 



/*
 * Nullability, safe operator and elvis operator
 */
// TODO



/* 
 * Reified generics
 */
// TODO: simple example


/*
 * Extension functions
 */
// compiled to static methods, so don't have access to private members :( 
// miss a function on a class you are working with? Create it!
fun String.padWithTilde() = "~$this~"

fun Int.square() = this*this

// TODO: example from bigger library?



/*
 * DSL
 */

	








