package Lesson10.impl;


import Lesson10.Convertable;
import Lesson10.TemperatureValue;

import static Lesson10.impl.FahrenheitToCelsiusConverter.DELTA;
import static Lesson10.impl.FahrenheitToCelsiusConverter.KOEFFICIENT;

public class CelsiusToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
