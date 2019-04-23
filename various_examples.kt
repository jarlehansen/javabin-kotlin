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

val artist = "Leonardo DaVinci"
println(artist[2]) // access characters in a String like you would in an array


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

// TODO. should probably cover default values? and named parameters...

/* 
 * Classes
 */ 
// classes are final by default
class YouShallNotSubclass

// use open to make it subclassable
open class SubclassMe


// equals, hashcode, copy and a lot of other goodies :)
// could probably have handled whitespace and tolowercase as well, but kept it simple :P 
data class Person(val firstName : String, val lastName : String, val company : String) {
	val email : String
        get() = "$firstName.$lastName@$company.com"
}

// no need for getters or setters (for ANY class, not just data class)
// val/var determines if you get getters or both getters and setters
// just threat them as properties anyway ;) 
class Car(val plateNumber : String, var ownerName : String)

val bugattiChiron = Car("KH34534534", "Nils-Arne")
println("${bugattiChiron.plateNumber}") // only getter because val
bugattiChiron.ownerName = "Kjell-Britt"  // both setter and getter because var
println("${bugattiChiron.ownerName}")


/*
 * Collections, Functional programming and functional composition
*/
// immutable list
// also have mutableListOf for mutable lists and many other ways of creating collections
val computers = listOf("Commodore 64", "ZX Spectrum", "Amiga 500", "Atari 800")
val computersThatDoesntHaveNumbers = computers.filter {
	it.matches(".*\\d*.*")
}

listOf(1,3,4,5).map {
	it*2
}.forEach {
	println("Number: $it")
}

// TODO: should probably have some more...



/*
 * Nullability, safe operator and elvis operator
 */
// Kotlin differentiates between nullable and non-nullable types
// all types so far has been non-nullable
var iCanBeNull : Int? = 2
var iCanAlsoBeNull : String? = null

// assume we have a class Person with an address object as a child.
// Both address and Person can be null.
val displayAddress =  person?.address?.streetName ?: "none"

// TODO: should probably have more cool examples here


/* 
 * Reified generics
 */
// usuaully you do not have access to class reference when  using generics (lost at runtime)
fun <T> noClassReference(someVal : T) = println("something")

// reified generics can do it! but they have to be 
inline fun <reified T> classReference(someVal : T) = T::class.java

// probably a little too boring :( 


	
/*
 * Extension functions
 */
// compiled to static methods, so don't have access to private members :( 
// miss a function on a class you are working with? Create it!
fun String.padWithTilde() = "~$this~"

fun Int.square() = this*this

// TODO: example from bigger library?



/*
 * DSLs
 */
// many ways to create DSLs in Kotlin :)
fun String.applyToEachLetter(func : (char: Char) -> Char) : String {
	return this.toCharArray().map(func).joinToString("")
}

	

// using class bodies to create DSLs
class FunctionContext {
	fun highFive() = println("High five!")
}

fun highFiveBlock(body : FunctionContext.() -> Unit) {
	val functionContext = FunctionContext()
	functionContext.body()
}

highFiveBlock {
	// just high-five 3 times for some reason...
	highFive()
	highFive()
	highFive()
}


