package com.example.test_micrometer1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test-micrometer1")
class TestMicrometer1Controller {
    @GetMapping
    fun test() = "Hello world!"
}