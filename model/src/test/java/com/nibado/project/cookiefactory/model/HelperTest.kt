package com.nibado.project.cookiefactory.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HelperTest {

    @Test
    fun getAllRecipies() {
        println(Helper.allRecipies)
    }

    @Test
    fun info() {
        val info = Helper.info("Macaroon")
        assertThat(info).isEqualTo(CookieInfo(Cookie("Macaroon"), 60, setOf(Season.WINTER)))
    }

    @Test
    fun info_NotFound() {
        val info = Helper.info("NotFound")
        assertThat(info).isNull()
    }
}