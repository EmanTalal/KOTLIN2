package com.example.myapplication2


fun main() {
    for (number in 1..1000) {
        if (number != 71) {
            println(number)
        } else
            println("IT'S OVER 70!!")
    }

    println("------------------------------")

    var temperature = 30;
    while (temperature <=35 && temperature>=10 ) {
        val num= when (temperature) {
            30 -> {
                println("IT'S HOT")
            }
            20 -> {
                println("IT'S COMFY")
            }
            15 -> {
                println("IT'S COLD!!")
            }else -> println(temperature)
        }
        temperature--
    }
}

