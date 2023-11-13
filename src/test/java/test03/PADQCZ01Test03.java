package test03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PADQCZ01Test03 {

    @Before
    public void setup() {
        console("");
        console("****************");
        console("*** setUp -> ***");
        console("****************");
        console("");

    }

    @After
    public void tearDown() {
        console("");
        console("*******************");
        console("*** Test Ok! :) ***");
        console("*******************");
        console("");

    }

    @Test
    public void executeTest01() {

        long start = System.currentTimeMillis();
        System.out.println( "start = " + start );

        int n = 100;

        for (int i = 0; i < n; i++) {
            //System.out.println( i );
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        for (int m = 0; m < n; m++) {
                            for (int o = 0; o < n; o++) {

                            }
                        }
                    }
                }
            }
        }

        long finish = System.currentTimeMillis();
        System.out.println( "finish = " + finish );

        long total = finish - start;
        System.out.println( "total = " + total/1000.0 );

    }

    void console(String x) {
        System.out.println(x);
    }
}
