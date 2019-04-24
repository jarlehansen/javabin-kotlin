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

