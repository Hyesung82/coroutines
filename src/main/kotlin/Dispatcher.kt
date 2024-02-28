package org.example

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("${Thread.currentThread().name} #${Thread.currentThread().id} - runBlocking function")
        launch {
            println("${Thread.currentThread().name} #${Thread.currentThread().id} - launch function")
            withContext(Dispatchers.Default) {
                println("${Thread.currentThread().name} #${Thread.currentThread().id} - withContext function")
                delay(1000)
                println("10 results found.")
            }
            println("${Thread.currentThread().name} #${Thread.currentThread().id} - end of launch function")
        }
        println("Loading...")
    }
}
