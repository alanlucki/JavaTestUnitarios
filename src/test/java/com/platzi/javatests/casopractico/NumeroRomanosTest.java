package com.platzi.javatests.casopractico;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumeroRomanosTest {

    @Test
    public void string_void_when_number_es_zero() {
        assertThat(NumeroRomanos.int_to_roman(0),is(""));
    }
    @Test
    public void test_minor_1000() {
        assertThat(NumeroRomanos.int_to_roman(1),is("I"));
        assertThat(NumeroRomanos.int_to_roman(2),is("II"));
        assertThat(NumeroRomanos.int_to_roman(3),is("III"));
        assertThat(NumeroRomanos.int_to_roman(4),is("IV"));
        assertThat(NumeroRomanos.int_to_roman(5),is("V"));  
        assertThat(NumeroRomanos.int_to_roman(6),is("VI"));
        assertThat(NumeroRomanos.int_to_roman(7),is("VII"));
        assertThat(NumeroRomanos.int_to_roman(8),is("VIII"));
        assertThat(NumeroRomanos.int_to_roman(9),is("IX"));
        assertThat(NumeroRomanos.int_to_roman(10),is("X"));
        assertThat(NumeroRomanos.int_to_roman(0),is(""));

        assertThat(NumeroRomanos.int_to_roman(14),is("XIV"));
        assertThat(NumeroRomanos.int_to_roman(19),is("XIX"));
        assertThat(NumeroRomanos.int_to_roman(24),is("XXIV"));
        assertThat(NumeroRomanos.int_to_roman(40),is("XL"));
        assertThat(NumeroRomanos.int_to_roman(49),is("XLIX"));
        assertThat(NumeroRomanos.int_to_roman(90),is("XC"));
        assertThat(NumeroRomanos.int_to_roman(99),is("XCIX"));
        assertThat(NumeroRomanos.int_to_roman(400),is("CD"));
        assertThat(NumeroRomanos.int_to_roman(900),is("CM"));
    }

}