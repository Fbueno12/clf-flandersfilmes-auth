package br.com.clf.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClfAuthenticationApplication

fun main(args: Array<String>) {
	runApplication<ClfAuthenticationApplication>(*args)
}
