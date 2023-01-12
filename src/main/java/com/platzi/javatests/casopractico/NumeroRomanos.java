package com.platzi.javatests.casopractico;

public class NumeroRomanos {


    static String segmentNumerousRomano(int n) {
        int u = n % 10;
        n = n / 10;
        int d = n % 10;
        n = n / 10;
        int c = n;

        String cadena = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}[c];
        cadena +=  new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}[d];
        cadena +=  new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}[u];
        return cadena;
    }

    public static String int_to_roman(int n) {

        String cadena = "";

        while (n > 0) {
            int val = n % 1000;
            cadena = segmentNumerousRomano(val) + cadena;
            n = n / 1000;
        }

        return cadena;
    }
}
