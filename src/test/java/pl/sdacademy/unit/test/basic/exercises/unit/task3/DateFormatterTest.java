package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void shouldReturnCorrectFormatDate() {
        //given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate input = LocalDate.of(1900, 01, 02);
        String expectedResult = "1900-02-01";
        //when
        String result = dateFormatter.formatDate(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnIncorrectFormatDate() {
        //given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate input = LocalDate.of(1995, 10, 9);
        String expectedResult = "1995-10-09";
        //when
        String result = dateFormatter.formatDate(input);
        //then
        assertNotEquals(expectedResult, result);
        assertThat(result).isNotEqualTo(expectedResult);

    }

}