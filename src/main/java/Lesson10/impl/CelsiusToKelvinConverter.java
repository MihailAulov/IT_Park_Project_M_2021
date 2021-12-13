package Lesson10.impl;

import Lesson10.Convertable;
import Lesson10.TemperatureValue;

public class CelsiusToKelvinConverter implements Convertable {

    public static final double DELTA = 273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
