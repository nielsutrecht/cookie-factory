package com.nibado.project.cookiefactory.model

object Helper {
    val allCookies = listOf(
            Cookie("Pecan"),
            Cookie("Chocolate Chip"),
            Cookie("Peanut Butter"),
            Cookie("Snickerdoodle"),
            Cookie("Ginger Snap"),
            Cookie("Oatmeal Raisin"),
            Cookie("Macaroon"),
            Cookie("Macadamia Nut")
    )

    val cookieMap = allCookies.map { it.name to it }.toMap()

    val allIngredients = listOf(
            Ingredient("Flour", 10),
            Ingredient("Oatmeal", 12),
            Ingredient("Sugar", 5),
            Ingredient("Butter", 15),
            Ingredient("Peanut Butter", 20),
            Ingredient("Chocolate", 10),
            Ingredient("Raisin", 5),
            Ingredient("Ginger", 10, Season.SPRING),
            Ingredient("Macadamia", 10, Season.SUMMER),
            Ingredient("Pecan", 10, Season.FALL),
            Ingredient("Coco", 10, Season.WINTER))

    val ingredientMap = allIngredients.map { it.name to it }.toMap()

    val allRecipies = mapOf(
            "Pecan" to recipe("Flour" to 2, "Sugar" to 1, "Butter" to 1, "Pecan" to 2),
            "Chocolate Chip" to recipe("Flour" to 2, "Sugar" to 1, "Butter" to 1, "Chocolate" to 1),
            "Peanut Butter" to recipe("Flour" to 2, "Sugar" to 1, "Peanut Butter" to 2),
            "Snickerdoodle" to recipe("Flour" to 2, "Sugar" to 2, "Butter" to 2),
            "Ginger Snap" to recipe("Flour" to 2, "Sugar" to 1, "Butter" to 1, "Ginger" to 2),
            "Oatmeal Raisin" to recipe("Oatmeal" to 2, "Sugar" to 1, "Butter" to 1, "Raisin" to 2),
            "Macaroon" to recipe("Flour" to 2, "Sugar" to 1, "Butter" to 1, "Coco" to 2),
            "Macadamia Nut" to recipe("Flour" to 2, "Sugar" to 1, "Butter" to 1, "Macadamia" to 2)
    )

    fun info(cookie: Cookie) = allRecipies[cookie.name]!!.let { CookieInfo(cookie, it.cost(), it.seasons()) }
    fun info(name: String) = cookieMap[name]?.let { it to allRecipies[it.name]!! }?.let { CookieInfo(it.first, it.second.cost(), it.second.seasons()) }

    fun recipe(vararg ingredients: Pair<String, Int>) =  Recipe(ingredients.map { ingredientMap[it.first]!! to it.second })
}