package com.nibado.project.cookiefactory.service.cookie

import com.nibado.project.cookiefactory.model.CookieInfo
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient


@Service
class Service(@Value("\${service.cookies}") cookiesBaseUrl: String) {
    private var client = WebClient.create(cookiesBaseUrl)

    fun cookies() = client.get()
            .uri("/cookie", 1L)
            .accept(APPLICATION_JSON)
            .retrieve()
            .bodyToFlux(CookieInfo::class.java)
}