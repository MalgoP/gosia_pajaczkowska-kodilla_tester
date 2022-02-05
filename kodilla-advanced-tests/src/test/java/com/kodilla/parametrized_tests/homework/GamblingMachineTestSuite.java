package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToBeDrawn.csv", numLinesToSkip = 1)
    public void shouldCheckHowManyWins(@AggregateWith(NumbersAggregator.class) Set<Integer> numbers) {
        assertDoesNotThrow(() ->  gamblingMachine.howManyWins(numbers));
        try {
            int howManyWins = gamblingMachine.howManyWins(numbers);
            assertTrue(howManyWins>=0 && howManyWins<=6);
        } catch (InvalidNumbersException e) {
            e.printStackTrace();
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToBeDrawnBad.csv", numLinesToSkip = 1)
    public void shouldValidateNumbers(@AggregateWith(NumbersAggregator.class) Set<Integer> numbers) {
        assertThrows(InvalidNumbersException.class,() ->  gamblingMachine.howManyWins(numbers));
    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "/numbersToBeDrawnBad.csv", numLinesToSkip = 1)
//    public void shouldValidateNumbersSecondMethod(String numbers) {
//        String[] splitNumbers = numbers.split(",");
//        int[] splitInt = new int[5];
//
//        for(String number : splitNumbers) {
//            for (int i = 0; i < 6; i++) {
//                splitInt[i] = Integer.valueOf(number);
//            }
//        }
//    }
}