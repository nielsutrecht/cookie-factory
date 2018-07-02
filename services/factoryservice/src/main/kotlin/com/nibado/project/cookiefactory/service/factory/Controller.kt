package com.nibado.project.cookiefactory.service.factory

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/factory")
open class Controller {
    @PostMapping("/order")
    fun order(@RequestBody factoryOrder: FactoryOrder) {

    }

    data class FactoryOrder(val cookies: List<OrderItem>)
}