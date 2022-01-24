package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class DoublePerson {
    static Stream<Arguments> shouldCalculateBMI() {
        return Stream.of(
                Arguments.of(1.6, 35.0, "Very severely underweight"),
                Arguments.of(1.6, 40.0, "Severely underweight"),
                Arguments.of(1.6, 45.0, "Underweight"),
                Arguments.of(1.6, 64.0, "Normal (healthy weight)"),
                Arguments.of(1.6, 66.0, "Overweight"),
                Arguments.of(1.6, 82.0, "Obese Class I (Moderately obese)"),
                Arguments.of(1.6, 98.0, "Obese Class II (Severely obese)"),
                Arguments.of(1.6, 108.0, "Obese Class III (Very severely obese)"),
                Arguments.of(1.6, 120.0, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.6, 150.0, "Obese Class V (Super Obese)"),
                Arguments.of(1.6, 190.0, "Obese Class VI (Hyper Obese)")
        );
    }
}