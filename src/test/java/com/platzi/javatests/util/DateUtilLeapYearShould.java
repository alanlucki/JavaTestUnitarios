package com.platzi.javatests.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DateUtilLeapYearShould {

    @Test
    public void true_if_year_is_divisible_by_400() {
        assertThat(DateUtilLeapYear.bisiesto(1600),is(true));
    }
    @Test
    public void false_if_year_is_divisible_by_100_but_not_400() {
        assertThat(DateUtilLeapYear.bisiesto(2100),is(false));
    }

    @Test
    public void true_if_year_is_divisible_by_4_but_not_100() {
        assertThat(DateUtilLeapYear.bisiesto(1996),is(true));
    }

    @Test
    public void true_if_year_is_not_divisible_by_4() {
        assertThat(DateUtilLeapYear.bisiesto(1995),is(false));
    }

}