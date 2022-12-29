package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public void testRepeat01() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_negative() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", -1));
    }

    /*
        * Probar que un string cualquiera no es vacío
        * Probar que “” es un string vacío
        * Probar que null también es un string vacío
        Extra: un string con espacios " " también lo queremos considerar como vacío (pista: puedes usar la función trim)
    */

    @Test
    public void string_cualquiera_no_vacio() {
        boolean b = StringUtil.isEmpty("Hola Mundo");
        assertFalse(b);
    }

    @Test
    public void string_vacio_es_vacio() {
        boolean b = StringUtil.isEmpty("");
        assertTrue(b);
    }

    @Test
    public void string_null_es_vacio() {
        boolean b = StringUtil.isEmpty(null);
        assertTrue(b);
    }

    @Test
    public void string_espacios_en_blanco_es_vacio() {
        boolean b = StringUtil.isEmpty(" ");
        assertTrue(b);
    }

}