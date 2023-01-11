package com.platzi.javatests.util;

public class DateUtilLeapYear {

    public static boolean bisiesto(int x){
        if( x % 400 == 0) return true;
        if( x % 100 == 0) return false;
        if( x % 4 == 0) return true;
        return false;
    }
}
