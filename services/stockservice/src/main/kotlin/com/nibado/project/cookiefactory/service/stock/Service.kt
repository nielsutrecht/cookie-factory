package com.nibado.project.cookiefactory.service.stock

import com.nibado.project.cookiefactory.model.Helper
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
open class Service(private val repository: Repository) {
    private val ingredients = Helper.ingredientMap.keys

    fun take(ingredient: String, amount: Int) : Int? {
        if(!ingredients.contains(ingredient)) {
            return null
        }
        repository.add(ingredient, -amount)

        return amount
    }

    @PostConstruct
    private fun init() {
        ingredients.forEach { repository.add(it, 1000) }
    }
}