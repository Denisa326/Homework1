package com.example.session2


    class Car(val model: String)
    data class Book(val title: String)
    open class Animal {
        open fun sound() {
            println("Animal sound")
        }

        fun main() {

            // EX 1
            val car = Car("audi")
            println(car.model)

            // EX 2
            val book = Book("Hopeless")
            println(book)

            // EX 3


            class Cat : Animal() {
                override fun sound() {
                    println("Meow")

                }
            }
            //EX 4
            val fruits = listOf("mere", "pere", "kiwi")
            println(fruits[1])

            // EX 5
            val numbers = listOf(1, 2, 3)
            val mutableNumbers = mutableListOf(1, 2, 3)
            mutableNumbers.add(42)

            println(mutableNumbers)

            // EX 6
            val fructe = listOf("apple", "banana", "orange")

            fructe.forEach {
                println(it.uppercase())
            }

            // EX 7
            val numerbers = listOf(1, 2, 3, 6, 8)

            val result = numbers
                .filter { it > 5 }

            println(result)

            // EX 8
            val number = listOf(1, 2)

            val rezultat = number.map { it.toString() }

            println(rezultat)

            // EX 9
            Logger.log()

        }


        // EX 9
        object Logger {
            val name = "MyLogger"

            fun log() {
                println("Logging from $name")
            }
        }
    }
