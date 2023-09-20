package test02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PADQCZ01Test02 {

    private Factorial factorial;

    @Before
    public void setup() {
        console("");
        console("****************");
        console("*** setUp -> ***");
        console("****************");
        console("");
        factorial = new Factorial();

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
    public void executeTestCompute01(){

        console("");
        console("*******************");
        console("*** executeTest ***");
        console("*******************");
        console("");
        //Assert -> afirmar

        try {
            assertEquals(1, factorial.compute01(-1));
            fail();
        }catch (Exception ex){

        }
        assertEquals(1, factorial.compute01(0));
        assertEquals(1, factorial.compute01(1));
        assertEquals(2, factorial.compute01(2));
        assertEquals(6, factorial.compute01(3));
        assertEquals(24, factorial.compute01(4));

    }

    @Test
    public void executeTestCompute02(){

        console("");
        console("*******************");
        console("*** executeTest ***");
        console("*******************");
        console("");
        
        try {
            assertEquals(1, factorial.compute02(-1));
            fail();
        }catch (Exception ex){

        }
        assertEquals(1, factorial.compute02(0));
        assertEquals(1, factorial.compute02(1));
        assertEquals(2, factorial.compute02(2));
        assertEquals(6, factorial.compute02(3));
        assertEquals(24, factorial.compute02(4));

    }
    void console(String x){
        System.out.println(x);
    }
}
