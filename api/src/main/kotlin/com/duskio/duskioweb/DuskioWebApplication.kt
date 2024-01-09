package com.duskio.duskioweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DuskioWebApplication

fun main(args: Array<String>) {
    runApplication<DuskioWebApplication>(*args)
}
