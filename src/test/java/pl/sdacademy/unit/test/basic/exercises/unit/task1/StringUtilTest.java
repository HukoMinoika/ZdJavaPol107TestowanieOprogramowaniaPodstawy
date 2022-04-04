package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    // null
    // " "
    // "  "
    // "abc" "123"
    // "\n"
    // ""
    // " a", " a ", "a "

    @Test
    void shouldReturnTrueIfStringIsNull() {
        //given
        String input = null;
        //Metoda isBlank jest statyczna więc nie trzeba tworzyć instancji klasy
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //junit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfStringContainsOnlySpaces() {
        //given
        String input = " ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //junit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfStringContainsNewLine() {
        //given
        String input = "\n";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result); //junit
        assertThat(result).isFalse(); //assertJ
    }

    @Test
    void shouldReturnFalseIfStringContainsLetters() {
        //given
        String input = "abc";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringContainsNumbers() {
        //given
        String input = "123";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        //given
        String input = "";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfStringContainsLetterAndSpace() {
        //given
        String input = " a ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

}