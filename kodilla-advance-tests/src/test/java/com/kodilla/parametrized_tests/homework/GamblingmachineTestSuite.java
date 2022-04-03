package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {


    @ParameterizedTest
    @CsvFileSource(resources = "/numbersForMachine.csv")
    public void ShouldCalculateUserNumbers(String userNumbers) throws InvalidNumbersException {
        GamblingMachine machine = new GamblingMachine();
        String[] numbers = userNumbers.split(",");
        Set<Integer> numbers1 = new HashSet<>();
        for (String s : numbers) {
            int number = Integer.parseInt(s);
            numbers1.add(number);
        }


        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers1));


    }
}