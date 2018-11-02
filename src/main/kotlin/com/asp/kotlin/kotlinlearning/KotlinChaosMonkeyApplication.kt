package com.asp.kotlin.kotlinlearning

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = ["com.asp.kotlin.kotlinlearning"])
class KotlinChaosMonkeyApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinChaosMonkeyApplication::class.java, *args)
}

