package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    } //Dzięki tej adnotacji nie musimy deklarowac nowej instancji klasy w każdym teście

    @Test
    void shouldAddTwoNumbers() {
        //given
        int firstDigit = 1;
        int secondDigit = 5;
        int expectedResult = 6;
        //when
        int result = calculator.add(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        //given
        int firstDigit = 6;
        int secondDigit = 2;
        int expectedResult = 4;
        //when
        int result = calculator.subtract(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        //given
        int firstDigit = 3;
        int secondDigit = 4;
        int expectedResult = 12;
        //when
        int result = calculator.multiply(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldDivideTwoNumbers() {
        //given
        int firstDigit = 10;
        int secondDigit = 2;
        int expectedResult = 5;
        //when
        int result = calculator.divide(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result); //junit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }

}