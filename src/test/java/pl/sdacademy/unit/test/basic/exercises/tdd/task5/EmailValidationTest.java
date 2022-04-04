package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidationTest {

    // a-zA-z0-9 + @ + a-zA-Z0-9 + .(opcja) + a-zA-Z0-9
    // true
    // sda@sda.pl
    // 123sda@.pl
    // SDA123@sda.pl
    // sda@sda
    // sda@sda.com
    // sda@123.pl123
    // sda@SDA123.PL123

    // false
    // !@sda.pl
    // s,da@sda.pl
    // sda.pl
    // sda@
    // sda@sda.
    // sda@s,da
    // null

    // --- bonus
    // sda@sda.com.pl


    @Test
    void returnTrueIfEmailIsCorrect() {
        //given
        String emailStr = "sda@gmail.com";
        //when
        //EmailValidation.validate();
    }


    //then


}