package com.nibado.project.cookiefactory.service.stock

import org.springframework.stereotype.Repository

@Repository
open class Repository {
    private val ingredients = mutableMapOf<String, Int>()

    fun add(ingredient: String, amount: Int) : Int {
        ingredients[ingredient] = get(ingredient) + amount

        return get(ingredient)
    }

    fun get(ingredient: String) = ingredients.computeIfAbsent(ingredient) { _ -> 0 }
}