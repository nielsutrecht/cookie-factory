package com.nibado.project.cookiefactory.service.factory

import com.nibado.project.cookiefactory.model.Helper
import org.springframework.stereotype.Service

@Service
open class Service {
    fun order(items: List<OrderItem>) {
        val recipies = items.map { Helper.allRecipies[it.cookie]!! to it.qtty }
    }
}