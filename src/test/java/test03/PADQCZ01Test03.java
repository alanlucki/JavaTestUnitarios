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
    public void executeTest01(){

    }
    void console(String x){
        System.out.println(x);
    }
}
