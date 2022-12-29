package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat01(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_negative(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",-1));
    }

}