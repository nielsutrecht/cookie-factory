package com.nibado.project.cookiefactory.service.cookie

import com.nibado.project.cookiefactory.model.Helper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/cookie")
class Controller {
    @GetMapping
    fun all() = Flux.fromIterable(Helper.allCookies.map { Helper.info(it) }.sortedBy { it.cookie.name })
}