package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));
    }
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefggasda"));
    }
    @Test
    public void weak_when_has_only_letters_and_numbers() {
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcdefg1234"));
    }@Test
    public void weak_when_has_others_symbols() {
        assertEquals(STRONG,PasswordUtil.assessPassword("*abcdefg1234"));
    }
}