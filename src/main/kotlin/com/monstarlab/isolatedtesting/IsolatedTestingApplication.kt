package com.monstarlab.isolatedtesting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IsolatedTestingApplication

fun main(args: Array<String>) {
	runApplication<IsolatedTestingApplication>(*args)
}
