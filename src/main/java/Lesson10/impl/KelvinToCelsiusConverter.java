package Lesson10.impl;

import Lesson10.Convertable;
import Lesson10.TemperatureValue;

import static Lesson10.impl.CelsiusToKelvinConverter.DELTA;

public class KelvinToCelsiusConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
