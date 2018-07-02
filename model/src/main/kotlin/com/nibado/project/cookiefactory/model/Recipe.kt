package com.nibado.project.cookiefactory.model

data class Recipe(val ingredients: List<Pair<Ingredient, Int>>) {
    fun cost() = ingredients.map { it.first.cost * it.second }.sum()
    fun seasons() = ingredients.mapNotNull { it.first.season }.toSet()
}