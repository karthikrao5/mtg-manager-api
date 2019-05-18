package com.karthik.mtgmanagerapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.karthik")
class MtgManagerApiApplication

fun main(args: Array<String>) {
    runApplication<MtgManagerApiApplication>(*args)
}
