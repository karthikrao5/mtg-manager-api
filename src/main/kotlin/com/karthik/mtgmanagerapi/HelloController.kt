package com.karthik.mtgmanagerapi

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello world!"
    }
}