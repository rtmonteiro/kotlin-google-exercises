package com.example.demo

class Temperature {
    class TemperatureUnit {
        companion object {
            const val KELVIN = "Kelvin"
            const val CELSIUS = "Celsius"
            const val FAHRENHEIT = "Fahrenheit"
        }
    }

    fun printFinalTemperature(
        initialMeasurement: Double,
        initialUnit: String,
        finalUnit: String,
        conversionFormula: (Double) -> Double
    ): String {
        val finalMeasurement = String
            .format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
        return "$initialMeasurement degrees $initialUnit is" +
                " $finalMeasurement degrees $finalUnit."
    }
}
