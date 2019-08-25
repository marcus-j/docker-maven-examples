package de.marcusjanke.examples.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
open class SampleApp {

    @RequestMapping("/")
    fun index(): String {
        return "This is your spotify dockerfile-maven plugin sample app!"
    }
}

fun main(args: Array<String>) {
    runApplication<SampleApp>(*args)
}
