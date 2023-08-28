package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class TemperatureTest {
    @Test
    fun `temperature from Celsius to Fahrenheit`() {
        assertEquals("27.0 degrees Celsius is 80.60 degrees Fahrenheit.",
            Temperature().printFinalTemperature(27.0,
                Temperature.TemperatureUnit.CELSIUS,
                Temperature.TemperatureUnit.FAHRENHEIT
            ) { celsius -> celsius * 9 / 5 + 32 }
        )
    }

    @Test
    fun `temperature from Kelvin to Celsius`() {
        assertEquals("350.0 degrees Kelvin is 76.85 degrees Celsius.",
            Temperature().printFinalTemperature(350.0,
                Temperature.TemperatureUnit.KELVIN,
                Temperature.TemperatureUnit.CELSIUS
            ) { kelvin -> kelvin - 273.15 }
        )
    }

    @Test
    fun `temperature from Fahrenheit to Kelvin`() {
        assertEquals("10.0 degrees Fahrenheit is 260.93 degrees Kelvin.",
            Temperature().printFinalTemperature(10.0,
                Temperature.TemperatureUnit.FAHRENHEIT,
                Temperature.TemperatureUnit.KELVIN
            ) { fahrenheit -> (fahrenheit + 459.67) * 5 / 9 }
        )
    }
}