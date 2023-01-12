package com.platzi.javatests.casopractico;

public class FizzBuzz {

    public static String metodo(int x){

        if( x % 3 == 0 && x % 5 == 0) return "FizzBuzz";
        if( x % 3 == 0 ) return "Fizz";
        if( x % 5 == 0 ) return "Buzz";
        return "" + x;

    }

}
