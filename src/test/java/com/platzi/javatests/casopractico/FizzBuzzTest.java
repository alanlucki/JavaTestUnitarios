package com.platzi.javatests.casopractico;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizz_if_number_is_divisible_by_3() {
        assertThat( FizzBuzz.metodo(3), is("Fizz"));
        assertThat( FizzBuzz.metodo(6), is("Fizz"));
        assertThat( FizzBuzz.metodo(9), is("Fizz"));
        assertThat( FizzBuzz.metodo(12), is("Fizz"));
    }

    @Test
    public void buzz_if_number_is_divisible_by_5() {
        assertThat( FizzBuzz.metodo(5), is("Buzz"));
        assertThat( FizzBuzz.metodo(10), is("Buzz"));
        assertThat( FizzBuzz.metodo(25), is("Buzz"));
        assertThat( FizzBuzz.metodo(20), is("Buzz"));
    }

    @Test
    public void buzz_if_number_is_divisible_by_3_and_5() {
        assertThat( FizzBuzz.metodo(15), is("FizzBuzz"));
        assertThat( FizzBuzz.metodo(30), is("FizzBuzz"));
        assertThat( FizzBuzz.metodo(15), is("FizzBuzz"));
        assertThat( FizzBuzz.metodo(60), is("FizzBuzz"));
    }
    @Test
    public void number_if_number_is_not_divisible_by_3_or_5() {
        assertThat( FizzBuzz.metodo(2), is("2"));
        assertThat( FizzBuzz.metodo(4), is("4"));
        assertThat( FizzBuzz.metodo(8), is("8"));
        assertThat( FizzBuzz.metodo(14), is("14"));
    }


}