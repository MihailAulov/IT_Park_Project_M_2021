package Lesson10.impl;

import Lesson10.Convertable;
import Lesson10.TemperatureValue;

public class KelvinToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.KOEFFICIENT
                + FahrenheitToCelsiusConverter.DELTA;
    }
}
