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
        int howManyWins = 0;
        try {
            howManyWins = gamblingMachine.howManyWins(numbers);
        } catch (InvalidNumbersException e) {
            e.printStackTrace();
        }
        System.out.println(howManyWins);
    }
}