package br.com.line

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LineApplication

fun main(args: Array<String>) {
	runApplication<LineApplication>(*args)
}
